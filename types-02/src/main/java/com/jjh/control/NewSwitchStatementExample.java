package com.jjh.control;

import java.util.Scanner;

public class NewSwitchStatementExample {

    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter an integer: " );
        int value = myInput.nextInt();
        switch (value) {
            case 0 -> System.out.println("its a Zero");
            case 1 -> System.out.println("its a One");
            default -> System.out.println("Default");
        }
    }

}
