package com.jjh.domain;

public interface Printer {
	
	void prettyPrint();
	
	static void printMe() {
		System.out.println("Printer - printMe");
	}
	
}
