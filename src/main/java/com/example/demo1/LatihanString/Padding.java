package com.example.demo1.LatihanString;

//Latihan soal tgl 29 Mei 2023
public class Padding {
    public static void main(String[] args) {
        String word = leftPadd("abc",3);
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(" ");
        String word2 = rightPadd("abc",6);
        System.out.println(word2);
        System.out.println(word2.length());
    }

    //Left Padding
    public static String leftPadd(String s, int n){
        //check if n is negative or not
        if (n < 0){
            return "length cannot be negative";
        }
        StringBuilder builder = new StringBuilder(n);
        for (int i = 0;i < n;i++){
            builder.append('_');
        }
        builder.append(s);
        return builder.toString();
    }

    //Right Padding
    public static String rightPadd(String s, int n){
        //check if n is negative or not
        if (n < 0){
            return "length cannot be negative";
        }
        StringBuilder builder = new StringBuilder(s);

        for (int i = 1; i < s.length()+n-2 ; i++) {
            builder.append('_');
        }

        return builder.toString();
    }
}
