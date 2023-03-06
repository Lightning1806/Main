package com.Vishal;

import java.util.Scanner;

public class temp {
    public static void main(String[] args){
        System.out.println("Enter temperature in Celcius");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        double b = (a * 1.8) + 32;
        System.out.println("Temperature in Farahneiet is " + b );
    }
}
