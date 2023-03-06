package com.Vishal;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int [] arr2 = {10, 9, 8, 7 ,6, 5, 4,3,2,1 };
        int target2 = 9;
        int ans = binary(arr, target);
        System.out.println(ans);
        System.out.println(binary(arr2,target2));
    }

    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while (arr[start] <= arr[end]) {
            int mid = start+ (end-start) /2;
            if (target<arr[mid]){
                end = mid - 1;
            }
            else if (target>arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        while (arr[start] >= arr[end]) {
            int mid = start+ (end-start) /2;
            if (target>arr[mid]){
                end = mid - 1;
            }
            else if (target<arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}