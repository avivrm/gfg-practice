package com.gfg.practice.array;

import java.util.HashMap;
import java.util.Map;

public class CounDistinctElementInArr {

    public static void main(String[] args) {
        int[] arr = {3,4,3,3,4,2,5};
        int[] arr1 = {1,3,3,1,4};


        distinctInK(arr1, arr1.length, 3);
    }

    static void distinctInK(int[] arr, int n, int k){
        Map<Integer,Integer> m = new HashMap<>();
        int i = 0;

        for(;i<k;i++) {
            if(m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }else
                m.put(arr[i], 1);
        }

        System.out.println(m.size());

        for(;i<n;i++){
            if(m.containsKey(arr[i-k])){
                int reduceFrequency = m.get(arr[i-k])-1;
                if(reduceFrequency == 0)
                    m.remove(arr[i-k]);
                else{
                    m.put(arr[i-k],reduceFrequency);
                }
            }

            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }else{
                m.put(arr[i], 1);
            }

            System.out.println(m.size());
        }

    }


}
