package com.Vishal;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        //String name = in.nextLine();
        //System.out.println(name);
        String first = "Vishal";
        System.out.println(first.length());
        String last = "Aynodkar";
        String half = first.substring(0, first.length());
        System.out.println(half);
        String fullName = first + " Chandrakant " + last;
        System.out.println(fullName);
        System.out.println(fullName.length());

        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        for (int i=fullName.length()-1;i>=0;i--){
            System.out.print(fullName.charAt(i));
        }
    }
}
