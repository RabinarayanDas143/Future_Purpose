package com.example.WebDevelopment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjfileRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:/UTKARSH_ATM_CIA_DATA/25082024/UK100201_ej25082024";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String terminalId = null, location = null, dateTime = null, rspCode = null, transactionType = null;
            String transactionNo = null, rrn = null, cardNumber = null, fromAcctNo = null;
            String availBal = null, ledgerBal = null;

            while ((line = br.readLine()) != null) {
                // Only process lines that contain ':'
                if (line.contains(":")) {
                    String[] parts = line.split(":");

                    // Ensure that we are not accessing non-existent array elements
                    if (parts.length > 1) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();

                        // Extract relevant fields
                        switch (key) {
                            case "TERMINAL ID":
                                terminalId = value;
                                break;
                            case "LOCATION":
                                location = value;
                                break;
                            case "DATE & TIME":
                                dateTime = value;
                                break;
                            case "RSP CODE":
                                // Handle 'RSP CODE' and 'TRANSACTION TYPE' on the same line
                                if (line.contains("TRANSACTION TYPE")) {
                                    rspCode = line.substring(line.indexOf(':') + 1, line.indexOf("TRANSACTION")).trim();
                                    String type = line.substring(line.indexOf("TRANSACTION TYPE") + "TRANSACTION TYPE:".length()).trim();
                                    transactionType = type.contains("RS.") ? type : null;
                                } else {
                                    rspCode = value;
                                }
                                break;
                            case "TRANSACTION NO":
                                transactionNo = value;
                                break;
                            case "RRN":
                                rrn = value;
                                break;
                            case "CARD NUMBER":
                                cardNumber = value.substring(value.length() - 4);  // Extract last 4 digits
                                break;
                            case "FROM ACCT NO":
                                fromAcctNo = value.substring(value.length() - 4);  // Extract last few digits
                                break;
                            case "AVAIL BAL":
                                availBal = value;
                                break;
                            case "LEDGER BAL":
                                ledgerBal = value;
                                break;
                        }
                    }
                }
            }

            // Print the extracted values
            System.out.println("TERMINAL ID = " + terminalId);
            System.out.println("LOCATION = " + location);
            System.out.println("DATE & TIME = " + dateTime);
            System.out.println("RSP CODE = " + rspCode);
            System.out.println("TRANSACTION TYPE = " + (transactionType != null ? transactionType : "null"));
            System.out.println("TRANSACTION NO = " + transactionNo);
            System.out.println("RRN = " + rrn);
            System.out.println("CARD NUMBER = " + cardNumber);
            System.out.println("FROM ACCT NO = " + fromAcctNo);
            System.out.println("AVAIL BAL = " + availBal);
            System.out.println("LEDGER BAL = " + ledgerBal);} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
