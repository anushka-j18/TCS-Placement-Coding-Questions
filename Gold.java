/*
Rohan visits a jewellery showroom where every jewellery item is assigned an
index from 1 to N.

He buys two jewellery items with indices i and j.

The shopkeeper offers a special discount based on the following rule:

1. Consider every number in the range [i, j].
2. Find the total number of divisors of each number.
3. Count how many of these divisor counts are prime numbers.
4. Print that count as the discount.

Example:
Input:
10
16

Number      Divisors Count
10          4
11          2
12          6
13          2
14          4
15          4
16          5

Divisor counts:
4 2 6 2 4 4 5

Prime counts among them:
2, 2, 5

Output:
3
*/
import java.util.Scanner;
public class Gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first index (i):");
        int i = sc.nextInt();
        System.out.println("Enter the second index (j):");
        int j = sc.nextInt();

        int primeCount = 0;

        for (int num = i; num <= j; num++) {
            int divisorCount = countDivisors(num);
            if (isPrime(divisorCount)) {
                primeCount++;
            }
        }

        System.out.println("The discount count is: " + primeCount);
    }

    private static int countDivisors(int n) {
        int count = 0;
        for (int k = 1; k <= Math.sqrt(n); k++) {
            if (n % k == 0) {
                count += (k * k == n) ? 1 : 2; // Count both divisors
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) return false;
        }
        return true;
    }
}