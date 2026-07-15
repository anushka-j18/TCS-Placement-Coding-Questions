/* you are planning for a picnic party with friends who love maths subjects 
you decided to bring unique item N 
upto that numebr we have to check the number of prime numbers and if there are 0 or 1 prime numbers till that number
then we return 0
when it is more than 1 number then we have to take the sum of those prime numebrs and then print it  */

import java.util.Scanner;
public class PicnicParty {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of N:");
      int N = sc.nextInt();

        int sumOfPrimes = 0;
        int primeCount = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                sumOfPrimes += i;
                primeCount++;
            }
        }

        if (primeCount <= 1) {
            System.out.println("Sum of primes: 0");
        } else {
            System.out.println("Sum of primes: " + sumOfPrimes);
        }
        
        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}