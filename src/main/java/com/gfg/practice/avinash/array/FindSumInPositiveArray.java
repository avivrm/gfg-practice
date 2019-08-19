package com.gfg.practice.avinash.array;
public class FindSumInPositiveArray {

    public static void main(String[] args) {
        int[] arr = {5,3,2,8,6};
        int search = 13;
        System.out.println(getMax(arr, arr.length, search));
    }

    static boolean getMax(int[] arr, int n,int val){
        int leastIndex = 0;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];

            if(sum > val){
                sum -= arr[leastIndex];
                leastIndex +=1;
            }

            if(sum == val)
                return true;

        }

        return false;
    }
}
