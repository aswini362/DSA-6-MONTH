package dsa.LeetCode.Recursion;

public class PrintName {

    public static void main(String[] args) {
        printNameNthTime(1,5);

    }

    public static void printNameNthTime(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Aswini");
        printNameNthTime(i+1,n);
    }
}
