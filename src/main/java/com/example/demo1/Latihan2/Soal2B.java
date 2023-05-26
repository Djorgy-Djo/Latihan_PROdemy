package com.example.demo1.Latihan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Soal2B {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 9;
        Stream.iterate(1, i -> i+1).limit(n)
                .map(i -> (i <= n/2) ? fib(i) +" " : fib(n-i+1)+" ")
                .forEach(System.out::printf);
    }
}
