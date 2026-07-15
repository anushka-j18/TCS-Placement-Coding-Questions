/* we have N piles that contain stones and we are given information that who can make first move and in each term 
the player can remove any number of stone and atleast 
the player who doesnt move is to close the game 
the one who makes the last move wins  
for finding this solution we do the XOR operation */

import java.util.Scanner;

public class NPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int xor = 0;

        System.out.println("Enter stones in each pile:");
        for (int i = 0; i < n; i++) {
            int stones = sc.nextInt();
            xor ^= stones;
        }

        if (xor == 0)
            System.out.println("Second Player Wins");
        else
            System.out.println("First Player Wins");

        sc.close();
    }
}