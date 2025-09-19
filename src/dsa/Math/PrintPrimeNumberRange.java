package dsa.Math;

//sieve of eratosthenes
public class PrintPrimeNumberRange {
    public static void main(String[] args) {
        primeNumberRange(50);
    }

    public static void primeNumberRange(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }

        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(" " + i);
            }

        }

    }
}
