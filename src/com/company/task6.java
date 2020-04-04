package com.company;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        double res = (x+y+z)/3;
        double res2 = (x+y+z)%3;
        System.out.println("Результат и остаток от деления "+res+" / "+res2);
        double a = res/2;
        double a2 = res/2;
        System.out.println("Результат и остаток от деления "+a+" / "+a2);
        if ( a+a2 > 3 )
        {System.out.println("Программа выполнена корректно");}

    }
}
