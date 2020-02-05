package com.latihan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = {{1,2},{3,4},{5,6}};
        int[][] array2 = new int[3][2];
        int[][][] array3 = new int[3][2][3];

        printArray(array1);
        printArray(array2);

        //cara print array
        for (int i = 0; i<array1.length; i++){
            for (int j = 0; j<array1[i].length; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<array1.length; i++){
            System.out.println(Arrays.toString(array1[i]));
        }

        System.out.println("Array 3D = " + Arrays.deepToString(array3));

        for (int[] x: array1){
            for (int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] dataArray){
        System.out.println("array 2D = " + Arrays.deepToString(dataArray));
    }
}
