package com.latihan;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] angka = {0,1,2,3};


        // ArrayIndexOutOfBoundsException
        int input = scanner.nextInt();

        try {
            System.out.printf("Array angka[%d] adalah %d", input, angka[input]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index tidak sesuai");
        }


        // IOException
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("input.txt");
        }catch (IOException e){
            System.err.println("File input.txt tidak ditemukan\n");
        }

        System.out.println();


        // Gabungan

        input = scanner.nextInt();
        try { //bakal dieksekusi satu persatu, kalo ada eror, baru di catch
            System.out.printf("Array angka[%d] adalah %d\n", input, angka[input]);
            fileInputStream = new FileInputStream("anu.txt");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index tidak sesuai");
        }catch (IOException e){
            System.err.println("File anu.txt tidak ditemukan");
        }finally { //finally dipake untuk menutup file yang udah dibuka di try catch, dsb
            System.out.println("ini finally");
        }

        // throws Exception
        System.out.println("Throws Exception");
        try{
            int hasil = data(angka, input);
            System.out.println(hasil);
        } catch (Exception e){
            System.err.println(e);
        }

        System.out.println("Akhir program");

    }

    private static int data(int[] angka, int index) throws Exception {
        int hasil = angka[index];
        return hasil;
    }
}
