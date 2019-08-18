package com.gfg.practice.array;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        int search = 3;

        int pivot = getPivot(arr, 0, arr.length-1);

        if(arr[0] < search && search < arr[pivot]){
            System.out.println(getIndex(arr,0,pivot,search));
        }else{
            System.out.println(getIndex(arr,pivot+1,arr.length-1,search));
        }
    }

    static int getIndex(int[] arr, int l, int h,int val){
        if(l>h)
            return -1;

        int mid = (l+h)/2;

        if(arr[mid] == val)
            return mid;

        if(arr[mid]>arr[l] && arr[mid] > val)
            return getIndex(arr,l,mid,val);
        else {
            return getIndex(arr, mid + 1, h, val);
        }


    }

    static int getPivot(int[] arr, int l, int h){
        if(l>h)
            return -1;

        int mid = (l+h)/2;

        if(arr[mid] > arr[mid+1])
            return mid;

        if(arr[mid] > arr[l]){
            return getPivot(arr,mid+1,h);
        }else{
            return getPivot(arr,l,mid);
        }

    }

}
