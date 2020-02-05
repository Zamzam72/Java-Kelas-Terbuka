package com.latihan;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*try {
            FileInputStream fileInputStream = new FileInputStream("input.txt");
        }catch (IOException e){
            System.err.println(e);
        }*/

        FileInputStream fileInputStream = new FileInputStream("input.txt");

        System.out.println((char)fileInputStream.read());
        System.out.println((char)fileInputStream.read());
        System.out.println((char)fileInputStream.read());
        System.out.println((char)fileInputStream.read());
        System.out.println();

        fileInputStream.close();


        //FileOutputStream
        //BYTESTREAM
        fileInputStream = new FileInputStream("input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        int buffer=0;
        buffer = fileInputStream.read();

        while (buffer != -1){
            System.out.print((char)buffer);
            fileOutputStream.write(buffer); //naruh file ke output.txt
            buffer = fileInputStream.read();
        }

        System.out.println("\n");

        fileInputStream.close();
        fileOutputStream.close();

        //CHARSTREAM
        fileInputStream = new FileInputStream("input.txt");
        fileOutputStream = new FileOutputStream("output2.txt");

        FileReader fileReader = new FileReader("input.txt");
        FileWriter fileWriter = new FileWriter("output3.txt");

        buffer = fileInputStream.read();

        while (buffer != -1){
            System.out.print((char)buffer); // kalo dicetak ga sesuai dengan tulisan aslinya
            fileOutputStream.write(buffer);
            buffer = fileInputStream.read();
        }
        System.out.println();

        buffer = fileReader.read();

        while (buffer != -1){
            System.out.print((char)buffer); //kalo dicetak sesuai dengan tulisan aslinya
            fileWriter.write(buffer);
            buffer = fileReader.read();
        }

        fileInputStream.close();
        fileOutputStream.close();

        fileReader.close();
        fileWriter.close();

    }
}
