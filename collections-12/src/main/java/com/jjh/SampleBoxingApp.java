package com.jjh;

import java.util.ArrayList;
import java.util.List;

public class SampleBoxingApp {

    public static void main(String[] args) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        System.out.println("list: " + list);
        for (int i : list) {
            count = count +  i;
        }
        System.out.println("Count: " + count);
    }

}
