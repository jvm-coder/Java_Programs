// Sieve of Eratosthenes is an algorithm that finds all the primes upto a certain number.

import java.util.Scanner;

class SieveOfEratosthenes {
    public static void main(String args[]) {
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean composites[] = new boolean[n + 1];

        for(int i = 2; i * i <= n; i++) {
            if(!composites[i])
                for(int j = i * i; j <= n; j+=i)
                    composites[j] = true;
        }

        System.out.println("Primes:");
        for(int i = 2; i <= n; i++) 
            if(!composites[i])
                System.out.println(i);
    }
}