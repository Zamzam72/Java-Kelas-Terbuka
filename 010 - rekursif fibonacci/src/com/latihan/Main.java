package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.print("Deret fibonacci = ");
        angka = scanner.nextInt();
        System.out.println("Hasil fibonacci = " + fibonacci(angka));
    }

    private static int fibonacci(int a){
        if (a==1 || a==0) {
            return a;
        }
        else {
            return fibonacci(a-1) + fibonacci(a-2);
        }
    }
}
