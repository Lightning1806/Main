package com.Vishal;

import javax.swing.plaf.IconUIResource;

public class reccuring_number {
    public static void main(String[] args) {
        int  n = 2342552;
        int count =0;
        while(n>0){
            int rem = n % 10;
            if(rem==2){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
