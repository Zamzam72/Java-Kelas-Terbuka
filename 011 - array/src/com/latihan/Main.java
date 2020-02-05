package com.latihan;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] angka1 = {1, 2, 3, 4, 5};
        int[] angka2 = new int[5];
        int[] angka3 = new int[5];
        int[] angka4 = new int[10];
        int[] angka5 = {1, 2, 4, 5, 5};
        int[] angka6 = {1, 2, 3, 6, 5};

        // MENGKOPI ARRAY ========================================
        System.out.println("\nMengkokpi array cara looping :v ======");
        for (int i = 0; i < angka1.length; i++) {
            angka2[i] = angka1[i];
        }

        angka2[0] = 10;

        System.out.println("angka 1 = " + Arrays.toString(angka1));
        System.out.println("angka 2 = " + Arrays.toString(angka2));


        System.out.println("\nMengkokpi array cara copyOf ======");

        angka3 = Arrays.copyOf(angka1, 5);
        System.out.println("angka 3 = " + Arrays.toString(angka3));
        angka3 = Arrays.copyOf(angka2, 5);
        System.out.println("angka 3 = " + Arrays.toString(angka3));

        angka3[0] = 100;
        System.out.println("alamat angka 2 = " + angka2);
        System.out.println("alamat angka 3 = " + angka3);

        System.out.println("\nMengkokpi array cara copyOfRange ======");

        angka3 = Arrays.copyOfRange(angka2,0,4); //index 0 itu awalnya, 4 itu akhirnya
        // 4 ga masuk ke dalam copyOfRange... kayak i<4
        System.out.println("angka 2 = " + Arrays.toString(angka2));
        System.out.println("angka 3 = " + Arrays.toString(angka3));



        // FILL ARRAY ========================================
        System.out.println("\nFill array ======");
        System.out.println("angka 4 = " + Arrays.toString(angka4));
        Arrays.fill(angka4,3); //ngisi semua arraynya dgn angka 3
        System.out.println("angka 4 = " + Arrays.toString(angka4));


        // KOMPARASI ARRAY ========================================
        System.out.println("\nKomparasi array ======");

        System.out.println("equals ----------");
        if (Arrays.equals(angka5,angka6)){
            System.out.println("\tangka5 == angka6");
        }
        else {
            System.out.println("\tangka5 != angka6");
        }

        System.out.println("compare ----------");
        System.out.println("\t hasilnya " + Arrays.compare(angka5, angka6));
        // kalo angka5>angka6 hasilnya 1
        // kalo angka5<angka6 hasilnya -1
        // kalo angka5=angka6 hasilnya 0
        // ngelihatnya berdasarkan urutan index, nilai index array mana yg lebih besar


        System.out.println("mismatch ----------");
        System.out.println("\t hasilnya " + Arrays.mismatch(angka5, angka6));
        //ngecek index mana yang pertama kali beda nilainya


        //SORT =====================================================
        System.out.println("\nSort array ======");
        int[] angka7 = {5,3,6,7,8,1,2,4,5};
        Arrays.sort(angka7);
        System.out.println(Arrays.toString(angka7));

        //SEARCH =====================================================
        System.out.println("\nSearch array ======");
        System.out.println("angka 4 ketemu di index ke " + Arrays.binarySearch(angka7,4));
        //binary search harus di sorting dluu



        //LATIHAN ==================================================
        System.out.println("\nReverse array sort ======");
        int[] angka8 = {5,3,6,7,8,1,2,4,50};
        Arrays.sort(angka8);
        reverseOrder(angka8);

        System.out.println("\nMenggabungkan 2 array ======");
        int[] angka9 = {9,4,9,5,3,2,6,7,7,5,};
        int[] angka10 = new int[angka9.length + angka8.length];
        System.arraycopy(angka9,0, angka10, 0, angka9.length);
        System.arraycopy(angka8, 0, angka10, angka9.length, angka8.length);

        System.out.println("Hasil = "  + Arrays.toString(angka10));



        // PASS BY REFERENCES ======================================
        angka2 = angka1;
        System.out.println("\nPass By References ======" +
                "\nangka 1 = " + Arrays.toString(angka1));
        System.out.println("angka 2 = " + Arrays.toString(angka2));

        angka2[0] = 100;

        System.out.println("\nangka 1 = " + Arrays.toString(angka1));
        System.out.println("angka 2 = " + Arrays.toString(angka2));
    }

    private static void reverseOrder(int[] data){
        for (int i = data.length-1; i>=0; i--){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
