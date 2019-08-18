package com.gfg.practice.array;

import java.util.HashMap;
import java.util.Map;

class Test1 extends Exception{

}
public class Test {



    public static void main(String[] args) {
        /*try{
            execute();
        }catch (Exception e){
            System.out.println(e.getClass().getName());
        }*/

        /*try{
            throw new GFG();
        }catch (GFG t){
            System.out.println("in catch");
        }finally {
            System.out.println("In finallu");
        }*/

        Map<Integer,Integer> m = new HashMap<>();
        m.put(1,1);
        m.put(1,2);

        System.out.println(m.get(1));

    }

    public static void execute(){
        try{
            throw new IllegalArgumentException();

        }catch(Exception e){
            throw new NullPointerException();
        }finally {
            throw new IndexOutOfBoundsException();
        }
    }
}
