package com.Vishal;

public class function {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        main(a,b);
        first(45);

    }
    static int first(int a){
        System.out.println(a);
        return a;
    }
    static void first(int ...v){
        System.out.println();
        return ;
    }

    static int main(int a, int b){
        int sum = a + b;
        int diff = a - b;
        System.out.println(sum);
        System.out.println(diff);
        return(sum) ;
    }
}
