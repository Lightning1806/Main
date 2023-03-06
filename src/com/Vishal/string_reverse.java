package com.Vishal;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        reverse(name);

    }
    public static void reverse(String name){

        for (int i = name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }   
    }
}
