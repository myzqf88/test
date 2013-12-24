package com.java.calendar;

public class ChineseEra {
	 private int iYear;
	 private String[] sHeavenlyStems = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	 private String[] sEarthlyBranches = { "��", "��", "��", "î", "��", "��", "��", 
	    "δ", "��", "��", "��", "��" };
	 public ChineseEra() {
	    	iYear = 1981;
	 }
	 public ChineseEra(int iYear) {
	    if ((iYear < 2050) && (iYear > 1901))
	    	this.iYear = iYear;
	    else
	    	this.iYear = 1981;
	 }
	 public String toString() {
	    int temp;
	    temp = Math.abs(iYear - 1924);
	    return sHeavenlyStems[temp % 10] + sEarthlyBranches[temp % 12];
	 }
}
