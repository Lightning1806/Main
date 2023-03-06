package com.Vishal;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        System.out.println("Enter fisrt number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter second number");
        int b = in.nextInt();
        System.out.println("Enter third number");
        int c = in.nextInt();

        int largest = a;
        if (b>largest){
            largest = b;
        }
        if(c>largest){
            largest = c;
        }
        System.out.println(largest);
    }
}
