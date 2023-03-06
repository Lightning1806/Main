package com.Vishal;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
      //  int[] a = new int[5];
       //int a[] = {1};
        //System.out.println(a[0]);
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0 ; i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
