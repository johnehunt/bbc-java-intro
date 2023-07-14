package com.jjh;

record Person(String name, int age) {}

public class ArrayApp1 {
    public static void main(String [] args) {
        Person [ ] pa = {new Person("John", 58),
        new Person("Densie", 56),
        new Person("Phoebe", 26),
        new Person("Adam", 23)};

        // Loop using index
        for (int i=0; i < pa.length; i++) {
            System.out.println(pa[i]);
        }

        System.out.println("------------");

        // Loop using for-each
        for (Person p : pa) {
            System.out.println(p);
        }

        pa[3] = new Person("Natalia", 23);
        System.out.println(pa);

    }
}
