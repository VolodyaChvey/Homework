package com.Task4;

public class Rectangle extends Figure{
    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public int square(int height, int width) {
        int result = height*width;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
