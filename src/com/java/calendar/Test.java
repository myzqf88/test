package com.java.calendar;
public class Test {
    public static void main(String[] args) {
//     调用阳历日期转换农历日期方法 
        System.out.println(ChineseCalendar.sCalendarSolarToLundar(2012, 4, 9));
//     调用农历日期转换阳历日期方法 
        System.out.println(ChineseCalendar.sCalendarLundarToSolar(1954, 3, 29));
    }
}