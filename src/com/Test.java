package com;

public class Test {
    private A objA=new A();
    private static B objB =new B();
    public Test(){
        System.out.println("Test ");
    }

    public static void main(String[] args) {
        System.out.println("Main ");
        new Test();
    }
}
class A{
    public A(){
        System.out.println("A ");
    }
}
class B{
    public B(){
        System.out.println("B ");
    }
}
