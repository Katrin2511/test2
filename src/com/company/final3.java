package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class final3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        double x = sc.nextDouble();
        System.out.print("Введите сумму: ");
        double y = sc.nextDouble();
        double z = x * y;
        double i = Math.round(z* 100.0) / 100.0;
        System.out.print("Сумма в валюте: " + i  + " $");
    }
}
