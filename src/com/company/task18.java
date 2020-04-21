package com.company;

import java.util.Scanner;
import java.io.*;

public class task18 {
    public static void main(String[] args) {
        String s;
        String f;
        int linescount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Екатерина\\Desktop\\test3.txt"))) {
            while ((s = br.readLine()) != null) {
                linescount++;
                System.out.println(s);
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода:" + exc);
        }
        System.out.println("СТРОК - " + linescount);
        System.out.println("Введите текст для файла: ");
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("C:\\Users\\Екатерина\\Desktop\\test3.txt"))
        {
            for (int i = 0; i < linescount; i++) {
                String x = sc.nextLine();
                fw.write(x+"\n");
            }
            fw.close();
        }catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}