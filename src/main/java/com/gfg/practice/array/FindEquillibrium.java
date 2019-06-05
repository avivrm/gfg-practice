package com.gfg.practice.array;

public class FindEquillibrium {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int[] arr2 = {3,5,-4,-1};

        System.out.println(getIndex(arr2, arr2.length));
    }

    static int getIndex(int[] arr, int n){
        int rSum = 0;
        int lSum = 0;
        for(int i=0;i<arr.length;i++){
            rSum += arr[i];
        }

        for(int j = 0;j<arr.length;j++){
            rSum -= arr[j];

            if(lSum == rSum){
                return j;
            }
            lSum += arr[j];
        }
        return -1;
    }
}
