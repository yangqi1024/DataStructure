package com.itpiggy.datastructure;

import com.itpiggy.datastructure.tools.Times;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int target = 45;
        Times.test("fib1", () -> {
            System.out.println(fib1(target));
        });
        Times.test("fib2", () -> {
            System.out.println(fib2(target));
        });
    }

    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    /**
     * 0 1 1 2 3 5
     *
     * @param n
     * @return
     */
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 1; i < n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
