package com.gfg.practice.array;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInEverySubArrayOfK {

    public static void main(String[] args) {
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        getMaxInK(arr, arr.length, k);
    }

    static void getMaxInK(int[] arr, int n, int k) {
        int i = 0;
        Deque<Integer> q = new LinkedList<>();

        for (; i < k; i++) {
            while (!q.isEmpty() && arr[i] > arr[q.peekLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }

        for (int j = i; j < n; j++) {

            System.out.print(arr[q.peek()] + " ");

            while (!q.isEmpty() && q.peek() <= (j - k)) {
                q.removeFirst();
            }


            while (!q.isEmpty() && arr[j] > arr[q.peekLast()]) {
                q.removeLast();
            }

            q.addLast(j);
        }

        System.out.print(arr[q.peek()] + " ");
    }

}


