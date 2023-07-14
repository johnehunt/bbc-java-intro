package com.jjh.domain;

public class SampleApp6 {
    public static void main(String [] args) {
        Object obj = "Hello";
        if (obj instanceof String str) {
            int len = str.length();
            System.out.printf("The string %s is %d long", str, len);
        }
    }
}
