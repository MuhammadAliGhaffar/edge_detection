package com.company;

public class Main {

    public static void main(String[] args) {
        Main m1 = new Main();
        int[][] matrix = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        m1.edgeDetection(matrix, matrix.length, matrix.length);

    }

    public void edgeDetection(int a[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5 || i == 1 || j == 1 || i == 4 || j == 4)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println("");
        }
    }
}
