package com.company;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int sample[][] = new int[x][y];
        int length = sample.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < sample[i].length; j++) {
                System.out.print("Введите значения: ");
                sample[i][j] = in.nextInt();
            }

        }
        int firstrowindex = 0;
        for (int i=0; i < sample[firstrowindex].length; i++ ) {
            System.out.print(sample[firstrowindex][i]*3 + " ");
        }
    }
}