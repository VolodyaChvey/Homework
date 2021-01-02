package com;

public abstract class Device {
    protected String show;
    protected String sound;
    protected String desc;

    public Device(String show, String sound, String desc) {
        this.show = show;
        this.sound = sound;
        this.desc = desc;
    }

    public  void sound(){
        System.out.println(sound);
    }

    public abstract void show();

    public abstract void desc();
}
