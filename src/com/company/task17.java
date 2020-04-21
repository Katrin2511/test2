package com.company;

import java.io.*;

public class task17 {
    public static void main(String[] args) {
    String s;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Признак конца ввода - строка 'stop'");

    try (FileWriter fw = new FileWriter("C:\\Users\\Екатерина\\Desktop\\test2.txt"))
    {
        do {
            System.out.print("Введите текст для файла: ");
            s = br.readLine();

            if (s.compareTo("stop") == 0) break;

            s = s + "\r\n";
            fw.write(s);
        }while(s.compareTo("stop") != 0);
    }catch(IOException exc) {
        System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
