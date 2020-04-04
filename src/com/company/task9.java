package com.company;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = input.nextInt();
        int sample[] = new int[x];
        int length = sample.length;
        length = x;
        int index = 0;
        System.out.println("Введите данные");
        for (int i = 0; i < x; i++) {
            sample[i] = input.nextInt();
            if (i > sample.length) {
                break;
            }
        }
        System.out.println("Массив");
        for (int i = 0; i < x; i = i + 1) {
            System.out.print(sample[i] * 2);
            System.out.print("  ");
        }
    }
}