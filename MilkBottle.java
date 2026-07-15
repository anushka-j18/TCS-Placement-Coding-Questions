/* N is the toal Rs given to the boy
R1 is the cost of plastic bottle of 1L milk
R2 is the cost of glass bottle  of 1L milk 
R3 is the cost we get after we return the empty glass bottles
Find the maximum liters of milk the boy can but with Nrs  */

import java.util.Scanner;

public class MilkBottle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total money (N): ");
        int N = sc.nextInt();

        System.out.print("Enter cost of plastic bottle (R1): ");
        int R1 = sc.nextInt();

        System.out.print("Enter cost of glass bottle (R2): ");
        int R2 = sc.nextInt();

        System.out.print("Enter refund for glass bottle (R3): ");
        int R3 = sc.nextInt();

        int liters = 0;

        // If plastic is cheaper or equal in effective cost
        if (R1 <= (R2 - R3)) {
            liters = N / R1;
        }
        else {
            // Buy glass bottles repeatedly
            while (N >= R2) {
                N = N - R2;   // Buy milk
                liters++;     // Got 1 liter
                N = N + R3;   // Return bottle and get refund
            }

            // Buy remaining plastic bottles
            liters += N / R1;
        }

        System.out.println("Maximum liters of milk = " + liters);

        sc.close();
    }
}

/*
Logic:

1. Plastic bottle has no refund, so its effective cost is R1.

2. Glass bottle gives a refund of R3 after returning the empty bottle.
   Therefore, its effective cost is:
        Effective Cost = R2 - R3

3. Compare the effective costs:
   - If R1 <= (R2 - R3), plastic bottles are cheaper (or equal),
     so buy only plastic bottles.
     Maximum liters = N / R1.

4. Otherwise, glass bottles are more economical.
   Keep buying glass bottles as long as the current money is at least R2.
   After every purchase:
      - Pay R2 to buy 1 liter of milk.
      - Return the empty bottle and get R3 back.
      - Net money decreases by (R2 - R3).

5. When the remaining money becomes less than R2,
   glass bottles cannot be purchased anymore.
   Use the remaining money to buy plastic bottles.

6. Total liters =
      (Number of glass bottles purchased)
      + (Remaining money / R1).
*/