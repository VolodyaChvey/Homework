package com;

public class This {
    public static void main(String[] args) {
        This test= new This();
        System.out.println(test==test.test());
    }
    public This test(){
        return this;
    }
}
