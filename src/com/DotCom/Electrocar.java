package com.DotCom;

public class Electrocar {
    private  int id;

    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor=new Motor();
        motor.startMotor();
        int x=1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("Elecnrocar " + id + " is starting...");
    }
}
