package com;

class Super{
    Super(){
        System.out.println("Super constructor");
    }
}
public class Maan extends Super{
    Maan(){
        this(1);
        System.out.println("Maan() constructor");
    }
    Maan(int i){
        System.out.println("Maan (int) constructor");
    }

    public static void main(String[] args) {
        new Maan();
    }
}
