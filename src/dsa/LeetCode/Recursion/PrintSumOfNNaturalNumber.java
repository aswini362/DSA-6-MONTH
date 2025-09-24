package dsa.LeetCode.Recursion;

public class PrintSumOfNNaturalNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNatural(10));

    }

    public static int sumOfNatural(int n) {
        if (n == 0) {
            return n;
        }
        return n +sumOfNatural (n - 1);
    }
}
