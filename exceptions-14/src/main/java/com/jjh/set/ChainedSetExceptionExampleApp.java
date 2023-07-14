package com.jjh.set;

public class ChainedSetExceptionExampleApp {
    public static void main(String [] args) {
        try {
            throw new RuntimeException("Issue");
        } catch (Exception exp) {
            throw new SetException("Already in Set", 143, exp);
        }
    }
}
