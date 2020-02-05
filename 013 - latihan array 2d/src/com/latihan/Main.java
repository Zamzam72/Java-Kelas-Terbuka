package com.latihan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //PERKALIAN MATRIKS ===================================
        int[][] matrix_1 = {
                {1,2},
                {3,4}
        };

        int[][] matrix_2 = {
                {11,12,4},
                {13,14,5}
        };

        int baris_1 = matrix_1.length;
        int kolom_1 = matrix_1[0].length;


        int baris_2 = matrix_2.length;
        int kolom_2 = matrix_2[0].length;

        int[][] matrix_3 = new int[baris_1][kolom_2];
        int buffer;

        for (int i=0; i<baris_1; i++){
            for (int j=0; j<kolom_2; j++){
                buffer=0;
                for (int k=0; k<kolom_1; k++){
                    buffer += (matrix_1[i][k] * matrix_2[k][j]);
                }
                matrix_3[i][j] = buffer;
            }
        }

        for (int i=0; i<matrix_3.length; i++){
            System.out.print("[");
            for (int j=0; j<matrix_3[i].length; j++){
                System.out.print(matrix_3[i][j]);
                if (j == matrix_3[i].length-1){
                    System.out.println("]");
                }
                else {
                    System.out.print(",");
                }
            }
        }
    }
}
