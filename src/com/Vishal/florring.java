package com.Vishal;

public class florring {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6 ,8, 12,14,15};
        int target = 9;
        System.out.println(celing(arr, target));
    }
    static int celing(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1 ;
            } else if (target>arr[mid]) {
                start = mid+1;
            } else{
                return mid;
            }
        }return end;
    }
}
