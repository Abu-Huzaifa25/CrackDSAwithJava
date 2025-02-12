package com.miscellaneous_exercises.medium;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(findFibonacci(in.nextInt()));
    }

    static int findFibonacci(int n) {
        if (n == 0) return 0;  // if input value n == 0 than return 0
        if (n == 1) return 1;  // if input value n == 1 than return 1

        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;

    }
}
