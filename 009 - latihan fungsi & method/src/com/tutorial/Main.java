package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int panjang, lebar;

        System.out.println("LUAS PERSEGI==============");
        System.out.print("Panjang\t= ");
        panjang = scanner.nextInt();

        System.out.print("Lebar\t= ");
        lebar = scanner.nextInt();

        System.out.println();

        gambar(panjang,lebar);
        System.out.println("Luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }

    private static void gambar(int p, int l){
        System.out.println("Gambar============");
        for (int i = 0; i<p; i++){
            for (int j = 0; j<l; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int luas(int p, int l){
        return p*l;
    }

    private static int keliling(int p, int l){
        return (2*p)+(2*l);
    }
}
