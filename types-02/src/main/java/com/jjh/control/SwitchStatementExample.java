package com.jjh.control;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		Scanner myInput = new Scanner( System.in );
		System.out.print( "Enter an integer: " );
		int value = myInput.nextInt();
		switch (value) {
		case 0:
			System.out.println("its a Zero");
			break;
		case 1:
			System.out.println("its a one");
			break;
		default:
			System.out.println("Default");
		}
	}

}
