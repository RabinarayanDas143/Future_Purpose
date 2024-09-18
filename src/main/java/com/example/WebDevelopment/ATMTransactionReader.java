package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ATMTransactionReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:/UTKARSH_ATM_CIA_DATA/25082024/UK100201_ej25082024";
		readEJFile(filePath);
	}

	public static void readEJFile(String filePath) {
		String terminalId = "", location = "", dateTime = "", rspCode = "", transactionType = "", amount = "";
		String transactionNo = "", rrn = "", cardNumber = "", fromAcctNo = "", availBal = "", ledgerBal = "";
		int rowCount = 0;
		int sr_no;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			List<String> array = new ArrayList();
			List<List<String>> list = new ArrayList();
			while ((line = br.readLine()) != null) {
				sr_no = 1; // Initialize sr_no for each row

				// Make sure every expected field is set to avoid missing parameters
				terminalId = null;
				location = null;
				dateTime = null;
				rspCode = null;
				transactionType = null;
				amount = null;
				transactionNo = null;
				rrn = null;
				cardNumber = null;
				fromAcctNo = null;
				availBal = null;
				ledgerBal = null;

				if (line.startsWith("TERMINAL ID")) {
					if (line.contains("TERMINAL ID")) {
						terminalId = line.substring(line.indexOf(":") + 1).trim();
						array.add(terminalId);
					}
					line = br.readLine();
					if (line.startsWith("LOCATION") || line.startsWith(" LOCATION")) {
						location = line.substring(line.indexOf(":") + 1).trim();
						array.add(location);
					}
					line = br.readLine();
					if (line.startsWith("DATE & TIME")) {
						dateTime = line.substring(line.indexOf(":") + 1).trim();
						array.add(dateTime);
					}
					line = br.readLine();
					if (line.startsWith("RSP CODE")) {
						if (line.contains("TRANSACTION TYPE")) {
							rspCode = line.substring(line.indexOf(":") + 1, line.indexOf("TRANSACTION TYPE")).trim();
							array.add(rspCode);

							String transactionDetails = line
									.substring(line.indexOf("TRANSACTION TYPE") + "TRANSACTION TYPE:".length()).trim();
							if (transactionDetails.contains("RS.")) {
								transactionType = transactionDetails.substring(0, transactionDetails.indexOf("RS."))
										.trim();
								array.add(transactionType);

								amount = transactionDetails
										.substring(transactionDetails.indexOf("RS.") + "RS.".length()).trim();
								array.add(amount);
							} else {
								transactionType = transactionDetails;
								array.add(transactionType);
								array.add(null);
							}
						} else {
							rspCode = line.substring(line.indexOf(':') + 1).trim();
							array.add(rspCode);
						}
					}
					line = br.readLine();
					if (line.startsWith("TRANSACTION TYPE") || line.startsWith("TRANSACTION NO")) {
						if (line.startsWith("TRANSACTION TYPE")) {
							String transactionType_str = line.substring(line.indexOf(":") + 1).trim();
							if (transactionType_str.contains("RS.")) {
								transactionType = transactionType_str.substring(0, transactionType_str.indexOf("RS."))
										.trim();
								array.add(transactionType);

								amount = transactionType_str
										.substring(transactionType_str.indexOf("RS.") + "RS.".length()).trim();
								array.add(amount);
							} else {
								transactionType = transactionType_str;
								amount = null;
								array.add(transactionType);
								array.add(amount);
								// ps.setString(sr_no++, transactionType);
								// ps.setString(sr_no++, amount); // Set amount as null if not present
							}
							line = br.readLine();
						}
						if (line.startsWith("TRANSACTION NO")) {
							transactionNo = line.substring(line.indexOf(":") + 1).trim();
							array.add(transactionNo);
						}
					}
					line = br.readLine();
					if (line.startsWith("RRN") || line.startsWith("CARD NUMBER")) {
						if (line.startsWith("RRN")) {
							rrn = line.substring(line.indexOf(":") + 1).trim();
							array.add(rrn);
							line = br.readLine();
						}
						if (line.startsWith("CARD NUMBER")) {
							cardNumber = line.substring(line.indexOf(":") + 1).trim();
							array.add(cardNumber);
						}
					}
					line = br.readLine();
					if (line.startsWith("FROM ACCT NO")) {
						fromAcctNo = line.substring(line.indexOf(":") + 1).trim();
						array.add(fromAcctNo);
					}
					line = br.readLine();
					if (line.startsWith("AVAIL BAL") || !line.startsWith("AVAIL BAL")) {
						if (line.startsWith("AVAIL BAL")) {
							String availBal_str = line.substring(line.indexOf(":") + 1).trim();
							if (availBal_str.contains("RS.")) {
								availBal = availBal_str.substring(availBal_str.indexOf("RS.") + "RS.".length()).trim();
								array.add(availBal);
								// ps.setString(sr_no++, availBal);
							} else {
								array.add(availBal_str);
								// ps.setString(sr_no++, availBal_str);
							}
						} else {
							array.add(availBal);
						}
					}
					line = br.readLine();
					if (line.startsWith("LEDGER BAL") || !line.startsWith("LEDGER BAL")) {
						if (line.startsWith("LEDGER BAL")) {
							String ledgerBal_str = line.substring(line.indexOf(":") + 1).trim();
							if (ledgerBal_str.contains("RS.")) {
								ledgerBal = ledgerBal_str.substring(ledgerBal_str.indexOf("RS.") + "RS.".length())
										.trim();
								array.add(ledgerBal);
							} else {
								array.add(ledgerBal_str);
							}
						} else {
							array.add(ledgerBal);
						}
					}
					list.add(array);
					array = new ArrayList<>();
					continue;
				} else {
					continue;
				}

			}
			// System.out.println(list);
			for (List<String> str : list) {
				System.out.println(str);
			}
			System.out.println("Upload completed.....");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
