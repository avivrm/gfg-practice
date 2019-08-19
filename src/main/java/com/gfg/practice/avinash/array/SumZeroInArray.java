package com.gfg.practice.avinash.array;

import java.util.*;

public class SumZeroInArray {

    public static void main(String[] args) {
        int[] arr= {5,-3,-1,4,8,-20};  // -7
        int[] arr2={5,0,3};
        int[] arr3 = {5,-5,3};
        System.out.println(isZeroInArr(arr, arr.length));

        //boolean res = isZeroInArr(arr,arr.length) == 3;

    }

    static boolean isZeroInArr(int[] arr, int n){
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum += arr[i];

            if(set.contains(sum) || sum ==0)
                return true;

            set.add(sum);

        }
        return false;
    }
}
