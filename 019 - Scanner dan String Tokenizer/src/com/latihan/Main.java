package com.latihan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Scanner scanner = new Scanner(bufferedReader);

        System.out.println(scanner.next());

        while (scanner.hasNext()){
            System.out.print(scanner.next() + " "); // untuk membaca kata dengan pemisah spasi
        }

        System.out.println();

        //menggunakan pemisah tertentu
        FileReader fileReader2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileReader2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            System.out.print(scanner.next() + " | ");
        }

        System.out.println();
        System.out.println();

        //String tokenizer

        //baris pertama
        bufferedReader.reset();
        String data = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(data,",");

        while (stringTokenizer.hasMoreTokens()){
            System.out.print(stringTokenizer.nextToken() + " | ");
        }
        System.out.println();

        //baris kedua
        data = bufferedReader.readLine();
        stringTokenizer = new StringTokenizer(data,",");

        while (stringTokenizer.hasMoreTokens()){
            System.out.print(stringTokenizer.nextToken() + " | ");
        }


    }
}
