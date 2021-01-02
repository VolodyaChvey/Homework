package com;

public class SquareUtil {
    private static int count;

    private SquareUtil() {
    }

    public static double squareTriangle(int height, int base) {
        count++;
        return height * base / 2;
    }
    public static  int squareRectangle(int side1,int side2){
        count++;
        return side1*side2;
    }
    public static int squareSquare(int side){
        count++;
        return side*side;
    }
    public static int squareRhjmbus(int side, int height){
        count++;
        return side*height;
    }
    public static int counter(){
        return count;
    }
}
