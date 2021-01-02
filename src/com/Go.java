package com;

public class Go {
    public static void main(String[] args) {
        System.out.println(C.x);
    }
}
class  Aa{
    static {
        System.out.println("Aa");
    }
}
class Bb extends Aa{
    public static  int x=5;
    static {
        System.out.println("Bb");
    }
}
class C extends Bb{
    static {
        System.out.println("C");
        System.exit(0);
    }
}
