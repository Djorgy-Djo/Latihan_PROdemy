package com.example.demo1.Latihan1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal1B {
    public static void main(String[] args) {
        int n = 9;
        IntStream.range(0,n)
                .mapToObj(i -> IntStream.range(0,n)
                        .mapToObj(j-> (i == j) || (j == n-i-1) ? "*":" ")
                        .collect(Collectors.joining()))
                .forEach(System.out::println);

    }
}

