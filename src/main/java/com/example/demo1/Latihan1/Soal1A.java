package com.example.demo1.Latihan1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal1A {
    public static void main(String[] args) {
        int n = 9;
        IntStream.range(0, n).mapToObj(i -> IntStream.range(0,n)
                .mapToObj(j-> "* ").collect(Collectors.joining()))
                .forEach(System.out::println);
    }
}
