package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        float a,b,hasil;
        int pilih;
        char operator;

        System.out.println("========Program Kalkulator Sederhana");
        System.out.print("Masukkan a = "); a=userInput.nextFloat();
        System.out.print("Operator = "); operator=userInput.next().charAt(0);
        System.out.print("Masukkan b = "); b=userInput.nextInt();

        if (operator=='+'){
            hasil=a+b;
            System.out.println("Hasil = " + hasil);
        }
        else if (operator=='-'){
            hasil=a-b;
            System.out.println("Hasil = " + hasil);
        }
        else if (operator=='*'){
            hasil=a*b;
            System.out.println("Hasil = " + hasil);
        }
        else if (operator=='/'){
            if (b==0){
                System.out.println("Hasil sama dengan tak hingga");
            }
            else {
                hasil=a/b;
                System.out.println("Hasil = " + hasil);
            }
        }

        System.out.println("=========PROGRAM KALKULATOR LAGI");
        System.out.print("1. Penjumlahan\n2.Pengurangan\n3. Perkalian\n" +
                "4. Pembagian\nPilih :"); pilih=userInput.nextInt();
        System.out.println("");
        System.out.print("Masukkan a = "); a=userInput.nextFloat();
        System.out.print("Masukkan b = "); b=userInput.nextInt();

        switch (pilih){
            case 1 :
                hasil=a+b;
                System.out.println("Hasil = " + hasil);
                break;

            case 2 :
                hasil=a-b;
                System.out.println("Hasil = " + hasil);
                break;

            case 3 :
                hasil=a*b;
                System.out.println("Hasil = " + hasil);
                break;

            case 4 :
                hasil=a/b;
                System.out.println("Hasil = " + hasil);
                break;

            default :
                System.out.println("Input Anda salah !");
        }
    }
}
