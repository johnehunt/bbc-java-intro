package com.jjh.expression;

public sealed interface Expr permits ConstantExpr {
    public int eval();
}

