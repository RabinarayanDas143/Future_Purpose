package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:/UTKARSH_ATM_CIA_DATA/25082024/UK100201_ej25082024";

		String terminalId = "", location = "", dateTime = "", rspCode = "", transactionType = "", amount = "";
		String transactionNo = "", rrn = "", cardNumber = "", fromAcctNo = "", availBal = "", ledgerBal = "";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("TERMINAL ID")) {
					terminalId = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("terminalId is :" + terminalId);
				} else if (line.startsWith("LOCATION") || line.startsWith(" LOCATION")) {
					location = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("location is :" + location);
				} else if (line.startsWith("DATE & TIME")) {
					dateTime = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("dateTime is :" + dateTime);
				} else if (line.startsWith("RSP CODE")) {
					if (line.contains("TRANSACTION TYPE")) {
						// Extract the RSP CODE part
						rspCode = line.substring(line.indexOf(":") + 1, line.indexOf("TRANSACTION TYPE")).trim();
						System.out.println("RSP CODE = " + rspCode);

						// Extract the TRANSACTION TYPE part
						String transactionDetails = line
								.substring(line.indexOf("TRANSACTION TYPE") + "TRANSACTION TYPE:".length()).trim();
						if (transactionDetails.contains("RS.")) {
							// Extract the TRANSACTION TYPE (everything before "RS.")
							transactionType = transactionDetails.substring(0, transactionDetails.indexOf("RS.")).trim();
							System.out.println("TRANSACTION TYPE = " + transactionType);

							// Extract the AMOUNT (everything after "RS.")
							amount = transactionDetails.substring(transactionDetails.indexOf("RS.") + "RS.".length())
									.trim();
							System.out.println("AMOUNT = " + amount);
						} else {
							transactionType = transactionDetails;
							System.out.println("TRANSACTION TYPE = " + transactionType);
							System.out.println("AMOUNT = N/A");
						}
					} else {
						// If there is no TRANSACTION TYPE part, just extract RSP CODE
						rspCode = line.substring(line.indexOf(':') + 1).trim();
						System.out.println("RSP CODE = " + rspCode);
					}
				} else if (line.contains("TRANSACTION TYPE")) {
					transactionType = line.substring(line.indexOf(":") + 1).trim();
					if (transactionType.contains("RS.")) {
						// Find the index where "RS." starts and extract the amount after it
						  amount = transactionType.substring(transactionType.indexOf("RS.") + "RS.".length())
								.trim();
						transactionType = amount; // Now transactionType contains only the amount
					} else {
						transactionType = null;
					}
					System.out.println("transactionType is newline:" + transactionType);
				} else if (line.startsWith("TRANSACTION NO")) {
					transactionNo = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("transactionNo :" + transactionNo);
				} else if (line.startsWith("RRN")) {
					rrn = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("rrn is :" + rrn);
				} else if (line.startsWith("CARD NUMBER")) {
					cardNumber = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("cardNumber is :" + cardNumber);
				} else if (line.startsWith("FROM ACCT NO")) {
					fromAcctNo = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("fromAcctNo :" + fromAcctNo);
				} else if (line.startsWith("AVAIL BAL")) {
					availBal = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("availBal :" + availBal);
				} else if (line.startsWith("LEDGER BAL")) {
					ledgerBal = line.substring(line.indexOf(":") + 1).trim();
					System.out.println("ledgerBal :" + ledgerBal);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
