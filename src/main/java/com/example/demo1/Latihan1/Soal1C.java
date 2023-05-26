package com.example.demo1.Latihan1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Soal1C {
    public static void main(String[] args) {
        int n = 7;
        IntStream.range(0, n).mapToObj(i -> IntStream.range(0,n)
                        .mapToObj(j-> j+" ").collect(Collectors.joining()))
                .forEach(System.out::println);
    }
}
