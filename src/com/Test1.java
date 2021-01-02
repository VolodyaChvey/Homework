package com;

public class Test1 {
    public static void main(String[] args) {
        A1 a=new B1();
        System.out.println(a.get());
    }
}
class A1{
    Object get(){ return new Boolean(true);}
}
class B1 extends A1{
    Number get(){return new Integer(1);}
}