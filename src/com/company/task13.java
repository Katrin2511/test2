package com.company;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.equals(b));

        int alen = a.length();
        int blen = b.length();
        if (alen > blen)
            System.out.print(a);
        else if (alen < blen)
            System.out.print(b);
        else if (alen == blen)
            System.out.print("Длины строк равны");
    }
}