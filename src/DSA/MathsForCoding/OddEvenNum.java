package DSA.MathsForCoding;
/**
 * Write a program to check if the the given number is odd or even.
 * Return string "even" if the number is even, "odd" if the number is odd.
 * Example 1:
 * Input: num = 4
 * Output: "even"*/
public class OddEvenNum {
    public static void main(String[] args) {
        int num = 4;
        checkNumber(num);
    }
    public static String checkNumber(int num) {
        if (num%2 == 0){
            return "even";
        }
        else {
            return "odd";
        }
    }
}
