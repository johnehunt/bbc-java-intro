package com.jjh.samples;

import java.util.Objects;

public final class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() {
        return this.length;
    }

    double width() {
        return this.width;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    public int hashCode() {
        return Objects.hash(length, width);
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width +
                ']';
    }
}