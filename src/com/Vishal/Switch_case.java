package com.Vishal;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.println("yellow");
            case "apple" -> System.out.println("red");
            case "orange" -> System.out.println("orange");
            case "1","2","3" -> System.out.println("number");
            }
        }
    }

