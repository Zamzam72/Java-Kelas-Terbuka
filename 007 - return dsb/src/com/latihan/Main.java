package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Main userVoid = new Main();

        int pilih;
        String lagi;
        do {
            System.out.print("=======Program Kalkulator Sederhana\n");
            System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
            System.out.print("pilih : "); pilih=userInput.nextInt();

            userVoid.hitung(pilih);

            System.out.print("Lagi ? (y/n) "); lagi=userInput.next();
        } while (lagi.equals("y"));

    }

    private void hitung(int a) {
        Scanner userHitung = new Scanner(System.in);
        int x,y,hasil;
        switch (a) {
            case 1 :
                System.out.println("\n=======Penjumlahan");
                System.out.print("masukkan x : "); x=userHitung.nextInt();
                System.out.print("masukkan y : "); y=userHitung.nextInt();
                hasil=x+y;
                System.out.println("hasil = " + hasil);
                break;

            case 2 :
                System.out.println("\n=======Pengurangan");
                System.out.print("masukkan x : "); x=userHitung.nextInt();
                System.out.print("masukkan y : "); y=userHitung.nextInt();
                hasil=x-y;
                System.out.println("hasil = " + hasil);
                break;

            case 3 :
                System.out.println("\n=======Perkalian");
                System.out.print("masukkan x : "); x=userHitung.nextInt();
                System.out.print("masukkan y : "); y=userHitung.nextInt();
                hasil=x*y;
                System.out.println("hasil = " + hasil);
                break;

            case 4 :
                System.out.println("\n=======Pembagian");
                System.out.print("masukkan x : "); x=userHitung.nextInt();
                System.out.print("masukkan y : "); y=userHitung.nextInt();
                hasil=x/y;
                System.out.println("hasil = " + hasil);
                break;

            default :
                System.out.println("input anda salah");
        }
    }
}
