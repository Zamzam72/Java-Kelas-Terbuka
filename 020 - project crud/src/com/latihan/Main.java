package com.latihan;

import java.io.IOException;
import java.util.Scanner;

import CRUD.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUSer;
        boolean isLanjutkan = true;

        while (isLanjutkan){
            Utility.clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nPilih : ");
            pilihanUSer = terminalInput.next();

            switch (pilihanUSer){
                case "1":
                    System.out.println("-----------------");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("-----------------\n");
                    //tampilkanData
                    Operasi.tampilkanData();
                    break;
                case "2":
                    System.out.println("---------");
                    System.out.println("CARI BUKU");
                    System.out.println("---------\n");
                    //cariData
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("-----------");
                    System.out.println("TAMBAH BUKU");
                    System.out.println("-----------\n");
                    //tambahData
                    Operasi.tambahData();
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("---------");
                    System.out.println("UBAH BUKU");
                    System.out.println("---------\n");
                    //ubahData
                    Operasi.updateData();
                    break;
                case "5":
                    System.out.println("----------");
                    System.out.println("HAPUS BUKU");
                    System.out.println("----------\n");
                    //hapusData
                    Operasi.hapusData();
                    break;
                default:
                    System.out.println("\nInput Anda Salah");
            }

            isLanjutkan = Utility.getYesorNo("Apakah Anda ingin melanjutkan");
        }

    }
}
