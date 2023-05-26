package com.example.demo1.Latihan2;

import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Soal2A {
    public static void main(String[] args) {
        int n = 11;
        Stream.iterate(1, i -> i+1).limit(n)
                .map(i -> (i <= n/2) ? i +" " : n-i+1+" ")
                .forEach(System.out::printf);
    }
}
