package com.latihan;

import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        int a;
        System.out.print("masukkan angka = "); a = userInput.nextInt();

        for (int i=0; i<a; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=a-2; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<a; i++){
            for (int j=0; j<a; j++){
                if (j==i){
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=0; i<a; i++){
            for (int j=0; j<a; j++){
                System.out.print("* ");
                if (j+i==a-1){
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<a; i++){
            for (int j=0; j<a; j++){
                if (j+i>=a-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=0; i<a; i++){
            for (int j=0; j<a; j++){
                if (j+i<a-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
