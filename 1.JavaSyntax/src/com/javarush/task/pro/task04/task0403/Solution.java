package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        boolean word = false;
        int result = number1 + number2;
        while (!word) {
            System.out.println(result);
            String s = scanner.nextLine();
            word = s.equals("ENTER") ;
        }

    }
}