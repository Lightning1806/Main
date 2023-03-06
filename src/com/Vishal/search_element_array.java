package com.Vishal;

public class search_element_array {
    public static void main(String[] args) {
        int[] arr = {13, 53,45 , 25, 25,25};
        int target = 45;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
