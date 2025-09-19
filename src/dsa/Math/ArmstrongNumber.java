package dsa.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));
    }

    public static boolean isArmStrongNumber(int n) {
        if (n == 0) {
            return false;
        }

        int original = n;
        int digits = 0;
        while (n > 0) {
            n = n / 10;
            digits++;
        }
        int sum = 0;
        int temp = original;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digits);
            temp = temp / 10;
        }

        return original == sum;
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;

        }
        return result;
    }
}
