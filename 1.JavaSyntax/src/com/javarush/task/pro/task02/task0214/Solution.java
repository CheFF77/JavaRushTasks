package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String s1 = key.nextLine();
        String s2 = key.nextLine();
        String s3 = key.nextLine();

        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
