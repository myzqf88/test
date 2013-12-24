package com.java.calendar;

public class ChineseEra {
	 private int iYear;
	 private String[] sHeavenlyStems = { "¼×", "ÒÒ", "±û", "¶¡", "Îì", "¼º", "¸ı", "ĞÁ", "ÈÉ", "¹ï" };
	 private String[] sEarthlyBranches = { "×Ó", "³ó", "Òú", "Ã®", "³½", "ËÈ", "Îç", 
	    "Î´", "Éê", "ÓÏ", "Ğç", "º¥" };
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
