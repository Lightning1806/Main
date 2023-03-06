package com.Vishal;

import java.util.Arrays;

public class first_and_last_index {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,8,8,10};
        int target = 10;
        int[] ans = {-1,-1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);
        ans[0]= start;
        ans[1]= end;
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] arr, int target, boolean isFirstIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = (start + end)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                ans = mid;
                if(isFirstIndex){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }return ans;
    }
}

