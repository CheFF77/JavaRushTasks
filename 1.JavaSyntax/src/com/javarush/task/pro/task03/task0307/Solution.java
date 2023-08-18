package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean Young = (age < 20);
        boolean Old = (age > 60);
        if (Young || Old) {
            System.out.println("можно не работать");
        }

    }
}
