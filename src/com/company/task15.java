package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = in.nextInt();
        int sample[] = new int[x];
        int length = sample.length;
        for (int i = 0; i < length; i++) {
            System.out.print("Введите значения: ");
            sample[i] = in.nextInt();
        }
        for (int i = 0;i < sample.length; i++) {
            for (int j = sample.length - 1; j > i; j--) {
                if (sample[j] < sample[j - 1]) {
                    int tmp = sample[j];
                    sample[j] = sample[j - 1];
                    sample[j - 1] = tmp;
                }
            }
        }
        System.out.print("Вывод " + Arrays.toString(sample));
    }
}