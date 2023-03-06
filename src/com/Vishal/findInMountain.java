package com.Vishal;

public class findInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 1;
        int peak1 = peak(arr);
        int first = binary(arr,target,0,peak1);
        if (first != -1){
            System.out.println(first);
        }else {
            System.out.println(binary(arr, target, peak1 + 1, arr.length - 1));
        }
    }
    public static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = (start+end)/2;
            if (arr[mid]<arr[mid+1]){
                start = mid +1;
            }else end = mid;
        }return start;

    }
    static int binary(int[] arr, int target,int start, int end){

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
