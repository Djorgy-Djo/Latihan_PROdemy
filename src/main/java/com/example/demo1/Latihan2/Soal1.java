package com.example.demo1.Latihan2;
import java.util.Scanner;
import java.util.stream.Stream;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Mengambil nilai fibionacci ke - : ");
        int n = input.nextInt();
        Stream.iterate(new int[] {1,1} , t -> new int[]{t[1],t[0] + t[1]})
                .limit(n).forEach(x -> System.out.printf("%d ",x[0]));
    }
}
