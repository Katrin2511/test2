package com.company;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        String b=  a.replaceAll(" ", "");
        System.out.println(b);
    }
}