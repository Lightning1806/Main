package com.Vishal;

import java.util.Arrays;

public class search_2darr {
    public static void main(String[] args) {
        int[][] arr2d= new int[][]{
                {234, 63,7352},
                {232,767,17},
                {363,858,2326}
        };
        int target =767;
        int[] ans = search(arr2d, target);
        System.out.println(Arrays.toString(ans));
        }
    static int[] search(int[][] arr2d, int target){
        for (int row = 0; row<arr2d.length;row++){
            for (int col = 0; col<arr2d[row].length;col++){
                if (arr2d[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}

