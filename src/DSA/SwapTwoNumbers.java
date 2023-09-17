package DSA;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a two numbers num1 and num2 . Write a program to swap two numbers.
 * <p>
 * Example 1:
 * <p>
 * Input: num1=100 , num2=50
 * Output: num1=50 , num2=100
 * After swapping num1 becomes 50 and num2 becomes 100
 */
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        swapNumbers(a, b);
    }

    public static List<Integer> swapNumbers(int a, int b) {
        List<Integer> result = new LinkedList<>();
        a = a + b;
        b = a - b;
        a = a - b;
        result.add(a);
        result.add(b);
        return result;
    }
}
