package com.Vishal;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {1234,52,26,216,21};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i = 0 ;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxInd = max(arr,0,last);
            swap(arr,maxInd,last);
        }
    }
    static void swap(int arr[],int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int max(int[] arr, int start, int end){
        int max = start;
        for (int i=0; i <=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}

