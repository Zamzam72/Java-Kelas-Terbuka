package com.latihan;

public class Main {

    public static void main (String[] args){

        System.out.println("halo " +  " ganteng"); //args itu kayak cin di c++
        System.out.println("kata 1 : hai");
        System.out.print("kata 2 : Hello World ! \n");
        System.out.println(" kata 3 :haha ");

        System.out.print("kata 4 : halo bro\n");
        System.out.print("kata 5 : halo juga bro... apa kabar ?\n");
        System.out.println("kata 6 : baik-baik aja bro... lu gmna ?");
        System.out.print("kata 7 : sama bro \nhehe");
        System.out.printf(" kata %d", 21);
        System.out.println("\n");


        //byte, short, int, long, float, boolean

        int x=8;
        int y=6;
        float z=x/(float)y-y;

        System.out.println("x + y = " + z);
        System.out.println("integer maximum = " + Integer.MAX_VALUE);
        System.out.println("integer minimum" + Integer.MIN_VALUE);
        System.out.println("byte = " + Integer.BYTES);
        System.out.println("Bit = " + Integer.SIZE);

        int w=y%x;
        System.out.println(w);

        x*=4; // x = x * 4
        System.out.println("Long byte = " + Long.BYTES);
        System.out.println("short byte = " + Short.BYTES);
        System.out.println("byte byte = " + Byte.BYTES);
        System.out.printf("hai %d\n %f",x,z);
        System.out.println("\nx++ = " + x++);
        System.out.println("x = " + x);
        System.out.println("\n");

        boolean allya=true;
        System.out.println("nilai boolean = " + !allya);
        System.out.println("nilai boolean = " + allya);


    }
}
