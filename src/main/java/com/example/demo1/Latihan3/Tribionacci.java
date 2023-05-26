package com.example.demo1.Latihan3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tribionacci {
    public static void main(String[] args) {
        int n =9;
        Stream.iterate(new int[]{1,1,1}, t-> new int[] {t[1],t[2],t[0] + t[1] + t[2]})
                .limit(n)
                .forEach(x -> System.out.printf("%d ",x[0]));
    }
}