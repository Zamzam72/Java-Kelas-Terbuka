package com.latihan;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered byte
        //INPUT BYTE
        FileInputStream fileInputStream = new FileInputStream("input.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //kalo pake buffered lebih cepet soalnya disimpen ke memory

        byte[] data = bufferedInputStream.readAllBytes();
        String kata = new String(data);

        System.out.println(kata);

        fileInputStream.close();
        bufferedInputStream.close();

        //OUTPUT BYTE
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write(data,0,data.length);
        bufferedOutputStream.flush();

        fileOutputStream.close();
        bufferedOutputStream.close();

        System.out.println();



        //Buffered Char
        //input
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.mark(200);

        String kata2 = bufferedReader.readLine();
        System.out.println(kata2);
        System.out.println(kata2);

        bufferedReader.reset();
        System.out.println((char)bufferedReader.read());

        kata2 = bufferedReader.readLine();
        System.out.println(kata2);


        //output
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedReader.reset();
        String kata3 = bufferedReader.readLine();
        bufferedWriter.write(kata3);
        bufferedWriter.flush();

        bufferedWriter.newLine();

        kata3 = bufferedReader.readLine();
        bufferedWriter.write(kata3);
        bufferedWriter.flush();

        bufferedWriter.newLine();

        kata3 = bufferedReader.readLine();
        bufferedWriter.write(kata3);
        bufferedWriter.flush();

    }
}
