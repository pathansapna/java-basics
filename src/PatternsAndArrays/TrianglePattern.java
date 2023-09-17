package PatternsAndArrays;

import java.util.Scanner;

/**
 * Write a program that prints out the following pattern:
    *
   ***
  *****
 */
public class TrianglePattern {
    public static void main(String[] args) {


        int n = 3;
        trianglePattern(n);

    }

    private static void trianglePattern(int n) {
        int num = 1;
        for(int j = 0; j < n; j++) {
            for(int i = n - 1; i > j; i--) {
                System.out.print(" ");
            }
            for(int i = 0; i < num; i++) {
                System.out.print("*");
            }
            num += 2;
            System.out.println();
        }
    }
}
