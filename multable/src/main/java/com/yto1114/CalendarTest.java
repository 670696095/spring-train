package com.yto1114;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month =date.getMonthValue();
        int today =date.getDayOfMonth();
        date = date.minusDays(today-1);
        System.out.println(date);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println(value);
        System.out.println("MON TUE WDX  THU FRI SAT SUN");
        for (int i = 0; i <value ; i++) {
            System.out.print("            ");
            while (date.getMonthValue()==month){
                System.out.printf("%3d",date.getDayOfMonth());
                if (date.getDayOfMonth() == today){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if(date.getDayOfMonth() ==5||date.getDayOfMonth() ==12||date.getDayOfMonth() ==19||date.getDayOfMonth() ==26){
                    System.out.println();
                }
            }
        }


    }
}
