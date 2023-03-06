package com.Vishal;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("smaller case");
        }else{
            System.out.println("uppercase");
        }
    }
}
