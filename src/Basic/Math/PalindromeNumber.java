package Basic.Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(checkNumberIsPalindrome(n));
    }

    public static boolean checkNumberIsPalindrome(int n) {
        if (n == 0) {
            return false;
        }
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        return temp == rev;
    }
}
