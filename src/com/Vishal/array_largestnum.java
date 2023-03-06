package com.Vishal;

import java.util.Scanner;

public class array_largestnum {
    public static void main(String[] args) {


        int arr[] ={
            13, 314, 566, 31, 65
        };
        System.out.println(largest(arr,1,4));
    }
    static int largest(int arr[], int start, int end){
        int largestNum = arr[start];
        for(int i = start; i <= end; i++){

            if (largestNum < arr[i]){
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

}


