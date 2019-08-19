package com.gfg.practice.avinash.recursion2;

import java.util.ArrayList;
import java.util.List;

public class Josephus {

    public static void main(String[] args) {

        List<Integer> list = getCircle(14);
        int k = 2;

        getSafePosition(list, k,0);

        System.out.println(list.get(list.size()-1));
    }

    public static void getSafePosition(List<Integer> circle, int killed, int pos){
        if(circle.size() == 1 || circle.size()<killed)
            return;

        int removeIndex = (pos + killed)-1;
        pos = removeIndex;


        if(pos>=circle.size()){
            pos = pos % circle.size();
        }

        circle.remove(pos);

        getSafePosition(circle, killed, pos);

    }

    public static List<Integer> getCircle(int number){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<number;i++){
            list.add(i+1);
        }
        return list;
    }
}
