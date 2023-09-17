package DSA;


public class SubtractProAndSumDigits {
    public static void main(String[] args) {
        int n = 234;
        subtractProductAndSum(n);
    }
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n >0) {
            sum += n % 10;
            product *= n % 10;
            n = n/10;
        }
        System.out.println(product - sum);
        return product - sum;
    }
}
