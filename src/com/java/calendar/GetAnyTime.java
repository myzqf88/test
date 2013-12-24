package com.java.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetAnyTime {

	/**
	 * @param args
	 */

	public static Date getAnyTime(int days){
        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,days);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果        
        return date;
	}
	
	public static String getAnyTimeString(int days){
        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,days);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(date);
        //System.out.println(dateString);
        return dateString;
	} 
	
	public static String getAnyTimeString(Date d){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        String dateString = formatter.format(d);
        //System.out.println(dateString);
        return dateString;
	} 
	
	public static String getAnyTime(String time){
		int y = Integer.parseInt(time.split("-")[0]);
		int m = Integer.parseInt(time.split("-")[1]);
		int d = Integer.parseInt(time.split("-")[2]);
		return ChineseCalendar.sCalendarSolarToLundar(y,m,d);    
	}
	
	public static Date getAnyTimeString(String time) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
    	Date date = formatter.parse(time);
        return date;
	} 

//	public static void main(String[] args) {
//		System.out.println(GetAnyTime.getAnyTime("2011-11-21"));
//	}
}
