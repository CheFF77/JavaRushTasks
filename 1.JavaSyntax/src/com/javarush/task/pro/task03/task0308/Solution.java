package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean firstCh = (x > 0 && y > 0);
        boolean secCh = (x < 0 && y > 0);
        boolean thirdCh = (x < 0 && y < 0);
        boolean fourthCh = (x > 0 && y < 0);
        if (firstCh) {
            System.out.println("1");
        }
        if (secCh) {
            System.out.println("2");
        }
        if (thirdCh) {
            System.out.println("3");
        }
        if (fourthCh) {
            System.out.println("4");
        }
    }
}
