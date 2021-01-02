package com;
class PrintSuper{
    private void print(){
        System.out.println(777);
    }
    void print(PrintSuper p){
        p.print();
    }
}
public class PrintSub extends PrintSuper{
    void print(){
        System.out.println(666);
    }

    public static void main(String[] args) {
        PrintSuper p=new PrintSuper();
        PrintSub q=new PrintSub();
        p.print(q);
    }
}
