package com.gfg.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 0};
        System.out.println(getEle(arr, arr.length));
    }

    static int getEle(int[] arr, int n){
        Arrays.sort(arr);

        int ele = -1;
        int eleCount = -1;

        int max = arr[0];
        int count = 1;
        for(int i=1;i<n;i++){
            if(max != arr[i]){
                count = 1;
                max = arr[i];
            }else{
                count += 1;
            }

            if(count > eleCount){
                eleCount = count;
                ele = max;
            }

        }
        return eleCount > n/2 ? ele : -1;
    }
}
