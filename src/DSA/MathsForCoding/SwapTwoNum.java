package DSA.MathsForCoding;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a two numbers num1 and num2 . Write a program to swap two numbers.
 * Example 1:
 *  Input: num1=100 , num2=50
 *  Output: num1=50 , num2=100
 *  After swapping num1 becomes 50 and num2 becomes 100*/
public class SwapTwoNum {
    public static void main(String[] args) {

    }

    public List<Integer> swapNumbers(int a, int b) {
        List<Integer> result = new LinkedList<>();
        a = a + b;
        b = a - b;
        a = a - b;
        result.add(a);
        result.add(b);
        return result;
    }
}
