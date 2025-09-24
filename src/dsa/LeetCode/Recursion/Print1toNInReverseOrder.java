package dsa.LeetCode.Recursion;

public class Print1toNInReverseOrder {
    public static void main(String[] args) {
        printNumberInReverseOrder(10);

    }
    public static void printNumberInReverseOrder(int n){
        if(n==0){
            return;
        }
        System.out.print(" " +n);
        printNumberInReverseOrder(n-1);
    }
}
