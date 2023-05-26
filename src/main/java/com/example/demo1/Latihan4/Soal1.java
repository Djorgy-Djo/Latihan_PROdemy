package com.example.demo1.Latihan4;

public class Soal1 {
    public static int fib(int n){
        if (n <= 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            if(i >= 5) {
                for (int j = 1; j <= n ; j++) {
                    if (j == i || j == (n - i + 1)) {
                        System.out.print(fib(j) + " ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if(i < 5) {
                for (int j = 1; j <= n ; j++) {
                    if (j == i || j == (n - i + 1)) {
                        System.out.print(fib(j) + " ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
