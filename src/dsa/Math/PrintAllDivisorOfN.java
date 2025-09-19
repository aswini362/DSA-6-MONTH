package dsa.Math;

import java.util.Set;
import java.util.TreeSet;

public class PrintAllDivisorOfN {
    public static void main(String[] args) {
        int n=36;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);
            }

        }
        System.out.println("      ");
        Set<Integer> set = printAllDivisors(n);
        System.out.println(set);

    }

    public static Set<Integer> printAllDivisors(int n) {
        Set<Integer> set=new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(i);
                if (i != n / i) {
                    set.add(n/i);
                }
            }
        }
        return set;
    }

}
