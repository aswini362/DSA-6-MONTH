package Basic.Math;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(digitSum(4554));

    }

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return sum;
    }
}
