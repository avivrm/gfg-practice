package com.gfg.practice.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindSumInArrayIncludesNegeativeNumber {

    public static void main(String[] args) {
        int[] arr = {3,2,-4,8,10,15}; // search = 14
        int search = 14;

        int[] arr2 = {1,-3,-4,2,7};
        int search2 = -2;

        System.out.println(find(arr2, arr2.length, search2));
    }

    static boolean find(int[] arr, int n, int search){

        Set<Integer> set = new HashSet<>();
        boolean isFound = false;
        int sum =0;
        for(int i =0;i<n;i++){
            sum += arr[i];

            if(set.isEmpty()){
                set.add(sum);
            }else{

                if(set.contains(sum - search)) {
                    isFound = true;
                    break;
                }else{
                    set.add(sum);
                }

            }
        }

        return true;
    }
}
