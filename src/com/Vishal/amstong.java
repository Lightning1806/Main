package com.Vishal;

import java.util.Scanner;

public class amstong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }
        if (sum == original) {
            return true;
        } else return false;
    }
}
