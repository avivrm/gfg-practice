package com.gfg.practice.recusrsion;

public class Test {
    public static void main(String[] args) {

        try{
            execute();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println(e.getClass().getName());
        }

    }
    void test(){
        System.out.println("he;llO");
    }
    public static void execute(){
        try{
            System.out.println("In catch");
            throw new  IllegalArgumentException();
        }catch (Exception e){
            System.out.println("In finally");
            throw new NullPointerException();
        }finally {
            throw new IndexOutOfBoundsException();
        }
    }

}
