package com.gfg.practice.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EqualSubarrayOf0And1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,0}; // op 6
        int[] arr2 = {1,1,1,0,1,1}; // op 2
        int[] arr3 = {1,1,1}; // op 0
        int[] arr4 = {1,1,1,0,0,1,0,1,1,1,0}; // op 8
        int[] arr8 = {0,1,1,0,1,1}; // not  working ??
        int[] arr9 = {0,0,1,1,0};


        int[] arr5 = {0,1,1,1,0,1};
        int[] arr6 = {0,0,0,1,1,0};

        int[] arr7 = sumUpArray(arr5, arr5.length,arr6, arr6.length);

        System.out.println(subArray(arr7, arr7.length, false));

        System.out.println(subArray(arr8, arr8.length, true));

        System.out.println(maxLen(arr9, arr9.length));
    }
    // common length in 2 array
    static int[] sumUpArray(int[] arr1, int m, int[] arr2, int n){
        int size = m >=n ? m : n;
        int[] arr = new int[size];

        int i = 0;
        while(i<size){
            if(i < arr1.length && i<arr2.length)
            {
                arr[i] = arr1[i] - arr2[i];
            }
            else if(i>=arr2.length)
                arr[i] = arr1[i];
            else{
                arr[i] = arr2[i];
            }
            i++;
        }
        return arr;
    }

    static int subArray(int[] arr, int n, boolean replace0With1){
        Map<Integer, Integer> m = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;
        Integer maxLength = 0;
        int prefix = 0;
        if(replace0With1){
            for(int i=0;i<n;i++){
                if(arr[i] == 0)
                    arr[i] = -1;
            }
        }

        for(int j=0;j<n;j++){
            prefix += arr[j];
            if(m.containsKey(prefix)){
               int start =  m.get(prefix);
               int end = j;
               int length = end - start;
               if(length > maxLength) {
                   maxLength = length;
                    startIndex = start;
                    endIndex = end;
               }
            }else{
                m.put(prefix, j);
            }
        }
        return maxLength;
    }

    static int maxLen(int arr[], int n)
    {
        // Creates an empty hashMap hM

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;     // Initialize sum of elements
        int max_len = 0; // Initialize result
        int ending_index = -1;
        int start_index = 0;

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        // Traverse through the given array

        for (int i = 0; i < n; i++)
        {
            // Add current element to sum

            sum += arr[i];

            // To handle sum=0 at last index

            if (sum == 0)
            {
                max_len = i + 1;
                ending_index = i;
            }

            // If this sum is seen before, then update max_len
            // if required

            if (hM.containsKey(sum + n))
            {
                if (max_len < i - hM.get(sum + n))
                {
                    max_len = i - hM.get(sum + n);
                    ending_index = i;
                }
            }
            else // Else put this sum in hash table
                hM.put(sum + n, i);
        }

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }

        int end = ending_index - max_len + 1;
        System.out.println(end + " to " + ending_index);

        return max_len;
    }
}
