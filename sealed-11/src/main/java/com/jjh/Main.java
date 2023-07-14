package com.jjh;

import com.jjh.expression.ConstantExpr;
import com.jjh.expression.Expr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting!");
        Expr e = new ConstantExpr(5);
        System.out.println(e);
        System.out.println("Done");
    }
}