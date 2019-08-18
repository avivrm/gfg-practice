package com.gfg.practice.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayOf0And1 {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println(getCount(arr, arr.length));
    }

    static int getCount(int[] arr, int n){
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=-0;i<n;i++){

            if(arr[i] == 0)
                arr[i] = -1;

            sum += arr[i];

            if(sum == 0)
                count++;

            if (m.containsKey(sum))
                count += m.get(sum);

            if(!m.containsKey(sum)){
                m.put(sum,1);
            }else{
                m.put(sum, m.get(sum)+1);
            }
        }

        return count;
    }
}
