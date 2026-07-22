/* bob playes a zombie game
each row has N zombies  and zombie energy is 1<=i<=N 
bob starts with B energy 
bob kills one zombie and lost 2 untis of his energy
we have to find if bob can kill all zombies or not 
print a yes or no  
enter first the inital energy of the bob and then the number of zombies and then the energy of each zombie
then print a yes or no  */

import java.util.Scanner;
public class BobGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial energy of Bob:");
        int B = sc.nextInt();
        System.out.println("Enter the number of zombies:");
        int N = sc.nextInt();
        int[] zombieEnergy = new int[N];
        System.out.println("Enter the energy of each zombie:");
        for (int i = 0; i < N; i++) {
            zombieEnergy[i] = sc.nextInt();
        }

        boolean canKillAll = true;
        for (int i = 0; i < N; i++) {
            if (B > zombieEnergy[i]) {
                B -= 2; // Bob loses 2 energy after killing a zombie
            } else {
                canKillAll = false;
                break;
            }
        }

        if (canKillAll) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/* why is the ans no for the input 10 3 3 4 5 
it should be a yes 
bob 10 
zombie 1 : 3 
10>3 he can kill 
when he kills the energy will be 10-2 
now it becomes 8 
zombie 2 : 4 
8>4 he can kill 
when he kills the energy will be 8-2 
now it becomes 6 
zombie 3 : 5 
6>5 he can kill 
when he kills the energy will be 6-2 
now it becomes 4 
so the answer is yes */
