package DSA;
/**
 * Given an integer num, return the number of digits in num that divide num.
 *
 * An integer val divides nums if nums % val == 0
 *
 * Example 1:
 *
 * Input: num = 121
 * Output: 2
 * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.*/
public class CountDigitsThatDividNum {
    public static void main(String[] args) {
        int num = 121;
        countDigits(num);
    }
    public static int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp != 0){
            int d = temp %10;
            temp /=10;

            if (d > 0 && num % d == 0)
                count++;
        }

        System.out.println(count);
        return count;
    }
}
