package com.gfg.practice.array;

import java.util.HashSet;
import java.util.Set;

public class ReArrangeArray {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        Set<Integer> s = new HashSet<Integer>();
        for(int val:arr){
            if(val != -1)
                s.add(val);
        }

        rearrange(s, arr);

        for (int val : arr)
            System.out.println(val);
    }

    static void rearrange(Set<? extends Number> set, int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(set.contains(i))
                arr[i] = i;
            else
                arr[i] = -1;
        }
    }
}
