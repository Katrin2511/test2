package com.company;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int x = 10;
        int y= 20;
        int z= 30;

        if (number==x) {
            System.out.println("Данное значение имеется в константах");}
        else if (number == y){
            System.out.println("Данное значение имеется в константах");}
        else if (number == z){
            System.out.println("Данное значение имеется в константах");}
        else {System.out.println("Такой константы нет!");}

    }

}