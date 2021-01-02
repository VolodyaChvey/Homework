package com;

public class Kettle extends Device{
    public Kettle(String show, String sound, String desc) {
        super(show, sound, desc);
    }




    @Override
    public void show() {
        System.out.println(show);
    }

    @Override
    public void desc() {
        System.out.println(desc);
    }
}
