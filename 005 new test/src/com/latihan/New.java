package com.latihan;

import java.util.Scanner;

public class New {

    public static void main (String[] args) {

        Scanner UserInput = new Scanner(System.in);

        int a;
        int[] b = new int[100];
        int[][] c = new int [100][100];

        System.out.print("masukkan nilai a = "); a= UserInput.nextInt();


        // latihan for
        for (int i = a; i<10; i=i+2){
            if (i==5){
                break;
            }
            else if (i==4){
                continue;
            }

            System.out.println(i);
        }

        System.out.println("Program selesai :)\n");


        // matriks
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                if (j==i){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println("Program selesai :)\n");


        // segitiga
        for (int i=0; i<=a;i++){
            for (int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=a;i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Program selesai :)\n");


        // array 1 dimensi
        for (int i=0;i<3;i++){
            b[i]=UserInput.nextInt();
        }
        for (int i=0;i<3;i++){
            System.out.println(b[i]);
        }



        // aray 2 dimensi

        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                c[i][j]=UserInput.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            System.out.print(i + ". ");
            for (int j=0;j<2;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
