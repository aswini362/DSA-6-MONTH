package dsa.Math;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkNumberIsPrime(1483));
    }

    public static boolean checkNumberIsPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
