package com.Vishal;

import java.util.Scanner;

public class reveseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>0){
            int a = n % 10;
            System.out.print(a);
            n = n / 10;
        }
    }
}
