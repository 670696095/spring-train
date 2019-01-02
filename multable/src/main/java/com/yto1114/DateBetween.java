package com.yto1114;

import java.util.Calendar;
import java.util.Date;

public class DateBetween {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        long time1 = cal.getTimeInMillis();
        cal.setTime(date2);
        long time2 = cal.getTimeInMillis();
        long betweenDays = (time2 - time1)/(24*3600*1000);

        System.out.println(Integer.parseInt(String.valueOf(betweenDays)));

        long time3 = 1258454548L;
        System.out.println(Integer.parseInt(String.valueOf(time3)));

    }

}
