package com.Vishal;

public class min_array {
    public static void main(String[] args) {
        int[] arr = {131,5346,758,5252,884,5823};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(ans>arr[i]){
                ans = arr[i];
            }
        }  return ans;
    }
}
