package com.latihan;

public class Main {

    public static void main(String[] args) {
        byte a=3;
        byte b;
        String a_bits, b_bits;

        a_bits=String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d",a_bits,a);

        //SHIFT LEFT
        System.out.println("\n=======SHIFT LEFT");
        b= (byte)(a<<3);
        b_bits=String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d",b_bits,b);

        //SHIFT RIGHT
        System.out.println("\n=======SHIFT RIGHT");
        b= (byte)(b>>2);
        b_bits=String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d",b_bits,b);


    }
}
