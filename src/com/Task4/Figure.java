package com.Task4;

public abstract class Figure {
    private int height;
    private int width;

    public Figure(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract int square(int height, int width);
}
