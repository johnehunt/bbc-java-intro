package com.jjh.control;

import java.util.Scanner;

public class SwitchExpressionExample {
    public static void main(String [] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter the day: " );
        String day = myInput.next().toUpperCase();
        boolean isTodayHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };
        System.out.println("Today is a holiday:" + isTodayHoliday);
    }
}
