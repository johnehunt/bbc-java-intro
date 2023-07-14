package com.jjh.shape;

public sealed class Rectangle extends Shape permits FilledRectangle {
    public double length, width;
}

