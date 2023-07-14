package com.jjh.expression;

//public final class ConstantExpr implements Expr {
//    int i; ConstantExpr(int i) { this.i = i; }
//    public int eval() {
//        return i;
//    }
//
//}

public record ConstantExpr(int i) implements Expr {
    public int eval() {
        return i;
    }
}
