package com.Vishal;

import java.util.Arrays;
import java.util.EnumSet;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {0,2,1,4,5};
        System.out.println(missingNumbr(arr));

    }
    static int missingNumbr(int[] nums){
        int i=0;
        while (i < nums.length){
            int correct = nums[i] ;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j =0; j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
}
