package com.example.demo1.Latihan1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal1D {
    public static void main(String[] args) {
        int n = 9;
        IntStream.range(0, n).mapToObj(i -> IntStream.range(0,n)
                        .mapToObj(j->(i == j || i == n -1 - j) ?
                                2 * j + 1 : " ").collect(Collectors.toList()))
                .forEach(System.out::println);
    }
}
