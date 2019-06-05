package com.gfg.practice.recusrsion;

public class AddNumber {

    public static void main(String[] args) {
        System.out.println(sum(5013));

        // count occurrence of 1
        System.out.println(count(50131));

        int[] arr = {4,5,9,2,6,8};
        System.out.println(evenSum(arr, 0, arr.length));
    }

    static int sum(int n){
        if(n<10)
            return n;

        return n%10 + sum(n/10);

    }


    static int count(int n){
        if(n<10) {
            if (n == 1)
                return 1;
            else {
                return 0;
            }
        }
        if(n%10 == 1)
            return 1 + count(n/10);
        else
            return count(n/10);
    }

    static int evenSum(int[] arr, int i, int n){
        if(i==n)
            return 0;

        if(arr[i]%2 == 0)
            return arr[i] + evenSum(arr, i+1, n);
        else
            return evenSum(arr,i+1,n);

    }
}
