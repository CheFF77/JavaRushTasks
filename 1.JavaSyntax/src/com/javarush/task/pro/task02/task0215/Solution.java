package com.javarush.task.pro.task02.task0215;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        System.out.println((a1+a2+a3)/3);
    }
}
