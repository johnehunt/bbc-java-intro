package com.jjh.domain;

public class SampleApp5 {
    public static void main(String [] args) {
        Object obj = "Hello";
        if (obj instanceof String) {
            String str = (String) obj;
            int len = str.length();
            System.out.printf("The string %s is %d long", str, len);
        }
    }

}
