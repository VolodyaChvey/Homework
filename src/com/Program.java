package com;

public class Program {
    static java.util.Random r=new java.util.Random();
    static Point randomPoint(){
        Point p =new Point();
        p.x =r.nextInt();
        p.y=r.nextInt();
        return p;
    }

    public static void main(String[] args) {
        Point arr[]=new Point[10];
        for(int i=0;i< arr.length; ++i)
            arr[i]=randomPoint();
        for(int i=0;i< arr.length; ++i)
            arr[i].show();
    }
}
class Point{
    int x=0,y=0;
    void  show(){
        System.out.println("x "+x+"y "+y);
    }
}
