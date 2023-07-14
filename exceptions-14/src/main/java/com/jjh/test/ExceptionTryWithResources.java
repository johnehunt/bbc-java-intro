package com.jjh.test;

import java.io.*;

public class ExceptionTryWithResources {

    public static void main(String [] args) {
        var worker = new FileWorker();
        var value = worker.readFirstLineFromFile("data.txt");
        System.out.println(value);
    }
}

class FileWorker {
    public String readFirstLineFromFile(String filename) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(filename))) {
            return br.readLine();
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        return "";
    }
}
