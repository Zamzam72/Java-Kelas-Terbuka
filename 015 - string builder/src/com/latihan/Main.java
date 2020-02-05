package com.latihan;

public class Main {

    public static void main(String[] args) {

        // mirip2 sama string biasa, cuman memorinya lebih efisien(bisa ditambah2)
        // tapi memorinya ga berubah
        StringBuilder builder = new StringBuilder("halo");

        printBuilder(builder);

        // APPEND (penambahan)
        builder.append(" Dunia!");
        printBuilder(builder);

        builder.append(" Saya Liek Allyandaru");
        printBuilder(builder);

        //INSERT
        builder.insert(4," seluruh");
        printBuilder(builder);

        // DELETE
        builder.delete(25,30);
        printBuilder(builder);

        // merubah char pada index
        builder.setCharAt(3,'u');
        printBuilder(builder);

        // REPLACE (mengganti kata)
        builder.replace(20,24,"Gue");
        printBuilder(builder);

        // CASTING dapat merubah address
        //cara 1
        String kata = String.valueOf(builder);

        System.out.println("Data = " + kata);
        System.out.println("Panjang = " + kata.length());
        int address = System.identityHashCode(kata);
        System.out.println("Address = " + Integer.toHexString(address) + "\n");

        //cara 2
        String kata2 = builder.toString();

        System.out.println("Data = " + kata2);
        System.out.println("Panjang = " + kata2.length());
        int address2 = System.identityHashCode(kata2);
        System.out.println("Address = " + Integer.toHexString(address2) + "\n");
    }

    private static void printBuilder(StringBuilder data){
        System.out.println("Data = " + data);
        System.out.println("Panjang = " + data.length());
        System.out.println("Kapasitas = " +  data.capacity());
        //kapasitas awal 16, ditambah kata "halo" jadi 20

        int address = System.identityHashCode(data);
        System.out.println("Address = " + Integer.toHexString(address) + "\n");
    }
}
