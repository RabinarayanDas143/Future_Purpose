package com.example.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReading {
	public static void main(String[] args) throws Exception {

		final Pattern TAG_REGEX = Pattern.compile(">(.+?)</");
		final Pattern node_REGEX = Pattern.compile("<(.+?)>");
		Matcher matcher;

		String thisLine = null;
		int count = 1;
		String hdr = "", trl = "";
		String trl_nMTI = "", trl_nFunCd = "", trl_nRecNum = "", trl_nUnFlNm = "", trl_nTxnCnt = "", trl_nRnTtlAmt = "";
		RupayUtilBean utilBean = new RupayUtilBean();
		RupayHeaderUtil headerUtil = new RupayHeaderUtil();

		FileInputStream fis = new FileInputStream(new File("C:\\xml file\\882UTKS76200012403500.xml"));
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		while ((thisLine = br.readLine()) != null) {
			final Matcher nodeMatcher = node_REGEX.matcher(thisLine);
			nodeMatcher.find();

			if (nodeMatcher.group(1).equalsIgnoreCase("Txn")) {
			} else if (nodeMatcher.group(1).equalsIgnoreCase("Hdr")) {
				hdr = "hdr";
			} else if (nodeMatcher.group(1).equalsIgnoreCase("/Hdr")) {
				hdr = "";
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nDtTmFlGen")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				headerUtil.setnDtTmFlGen(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nMemInstCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				headerUtil.setnMemInstCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nUnFlNm")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				if (hdr.equalsIgnoreCase("hdr")) {
					headerUtil.setnUnFlNm(matcher.group(1));
				} else if (hdr.equalsIgnoreCase("Trl")) {
					trl_nUnFlNm = matcher.group(1);
				}
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nProdCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				headerUtil.setnProdCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nSetBIN")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				headerUtil.setnSetBIN(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nFlCatg")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				headerUtil.setnFlCatg(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nVerNum")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				headerUtil.setnVerNum(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nAcqInstCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnAcqInstCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nAmtSet")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				double amtSet = Integer.parseInt(matcher.group(1));
				amtSet = amtSet / 100;
				utilBean.setnAmtSet(String.valueOf(amtSet));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nAmtTxn")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				double amtTxn = Double.parseDouble(matcher.group(1));
				amtTxn = amtTxn / 100;
				utilBean.setnAmtTxn(String.valueOf(amtTxn));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nApprvlCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnApprvlCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nRRN")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnARD(matcher.group(1));

			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCcyCdSet")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCcyCdSet(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCcyCdTxn")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCcyCdTxn(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nConvRtSet")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnConvRtSet(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCrdAcpAddAdrs")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCrdAcpAddAdrs(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCrdAcptTrmId")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCrdAcptTrmId(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCrdAcpZipCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCrdAcpZipCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nDtSet")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				if (hdr.equalsIgnoreCase("hdr")) {
					headerUtil.setnDtSet(matcher.group(1));
				} else {
					utilBean.setnDtSet(matcher.group(1));
				}
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nDtTmLcTxn")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnDtTmLcTxn(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nFunCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				if (hdr.equalsIgnoreCase("hdr")) {
					headerUtil.setnFunCd(matcher.group(1));
				} else if (hdr.equalsIgnoreCase("Trl")) {
					trl_nFunCd = matcher.group(1);
				} else {
					utilBean.setnFunCd(matcher.group(1));
				}

			} else if (nodeMatcher.group(1).equalsIgnoreCase("nLtPrsntInd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnLtPrsntInd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nMTI")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				if (hdr.equalsIgnoreCase("hdr")) {
					headerUtil.setnMTI(matcher.group(1));
				} else if (hdr.equalsIgnoreCase("Trl")) {
					trl_nMTI = matcher.group(1);
				} else {
					utilBean.setnMTI(matcher.group(1));
				}
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nPAN")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnPAN(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nRecNum")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				if (hdr.equalsIgnoreCase("hdr")) {
					headerUtil.setnRecNum(matcher.group(1));
				} else if (hdr.equalsIgnoreCase("Trl")) {
					headerUtil.setTrl_nRecNum(matcher.group(1));
					trl_nRecNum = matcher.group(1);
				} else {
					utilBean.setnRecNum(matcher.group(1));
				}
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nRGCSRcvdDt")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnRGCSRcvdDt(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nSetDCInd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnSetDCInd(matcher.group(1));

			} else if (nodeMatcher.group(1).equalsIgnoreCase("nTxnDesInstCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnTxnDesInstCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCrdAcpBussCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCrdAcpBussCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nCrdAcpNm")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnCrdAcpNm(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nTxnOrgInstCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnTxnOrgInstCd(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nUID")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnUID(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nFeeAmt")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnFeeAmt1(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nFeeCcy")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnFeeCcy1(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nFeeDCInd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnFeeDCInd1(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nFeeTpCd")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				utilBean.setnFeeTpCd1(matcher.group(1));
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nTxnCnt")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				trl_nTxnCnt = matcher.group(1);
			} else if (nodeMatcher.group(1).equalsIgnoreCase("nRnTtlAmt")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				trl_nRnTtlAmt = matcher.group(1);
			} else if (nodeMatcher.group(1).equalsIgnoreCase("/Txn")) {

				// header part

				System.out.println(headerUtil.getnMTI());
				System.out.println(headerUtil.getnFunCd());
				System.out.println(headerUtil.getnRecNum());
				System.out.println(headerUtil.getnDtTmFlGen());
				System.out.println(headerUtil.getnMemInstCd());
				System.out.println(headerUtil.getnUnFlNm());
				System.out.println(headerUtil.getnDtSet());
				System.out.println(headerUtil.getnProdCd());
				System.out.println(headerUtil.getnSetBIN());
				System.out.println(headerUtil.getnFlCatg());
				System.out.println(headerUtil.getnVerNum());

				// Body part

				System.out.println(utilBean.getnMTI());
				System.out.println(utilBean.getnFunCd());
				System.out.println(utilBean.getnRecNum());
				System.out.println(utilBean.getnDtTmLcTxn());
				System.out.println(utilBean.getnPAN());
				System.out.println(utilBean.getnARD());
				System.out.println(utilBean.getnAcqInstCd());
				System.out.println(utilBean.getnApprvlCd());
				System.out.println(utilBean.getnCrdAcptTrmId());
				System.out.println(utilBean.getnAmtTxn());
				System.out.println(utilBean.getnCcyCdTxn());
				System.out.println(utilBean.getnTxnOrgInstCd());
				System.out.println(utilBean.getnTxnDesInstCd());
				System.out.println(utilBean.getnDtSet());
				System.out.println(utilBean.getnAmtSet());
				System.out.println(utilBean.getnCcyCdSet());
				System.out.println(utilBean.getnConvRtSet());
				System.out.println(utilBean.getnRGCSRcvdDt());

				// fee
				System.out.println(utilBean.getnFeeAmt1());
				System.out.println(utilBean.getnFeeCcy1());
				System.out.println(utilBean.getnFeeDCInd1());
				System.out.println(utilBean.getnFeeTpCd1());

			} else if (nodeMatcher.group(1).equalsIgnoreCase("Trl")) {
				hdr = "Trl";
			} else if (nodeMatcher.group(1).equalsIgnoreCase("/Trl")) {
				matcher = TAG_REGEX.matcher(thisLine);
				matcher.find();
				hdr = "";
			}
		}
		// Trl
		System.out.println(trl_nMTI);
		System.out.println(trl_nFunCd);
		System.out.println(trl_nRecNum);
		System.out.println(trl_nUnFlNm);
		System.out.println(trl_nTxnCnt);
		System.out.println(trl_nRnTtlAmt);
	}
}
