package com.Vishal;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.insert(2,'e');
        System.out.println(sb);
        StringBuilder s1 = new StringBuilder("hello");
        s1.setCharAt(0,'p');
        System.out.println(s1);
         char a = s1.charAt(2);
        System.out.println(a);
        s1.delete(0,1);
        System.out.println(s1);
        s1.append("dasdaf");
        System.out.println(s1);
        System.out.println(s1.length());
    }
}
