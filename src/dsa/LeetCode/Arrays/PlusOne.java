package dsa.LeetCode.Arrays;

public class PlusOne {

    public static void main(String[] args) {

    }

    public static int[] plusOneAnArray(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        int[] results = new int[n + 1];
        results[0] = 1;
        return results;
    }
}
