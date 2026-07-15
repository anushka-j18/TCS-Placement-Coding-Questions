import java.util.Scanner;

/* a man wants to reach to the top of the mountain peak N 
current position he is standing is denoted by i
from each rock the main can skip x rocks or steps 
 how many steps he will require to reach the top?
 if current position is greater than one than return  */

 public class MountainClimb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        System.out.print("Enter x:  ");
        int x = sc.nextInt();
        
        System.out.print("Enter I:  ");
        int currentPosition = sc.nextInt();
        
        sc.close();

        int stepsRequired = 0;

        while (currentPosition < N) {
            currentPosition += x; // Skip x rocks
            if (currentPosition > N) {
                currentPosition = N; // Ensure he doesn't go beyond the peak
            }
            stepsRequired++;
        }

        System.out.println("Steps required to reach the top: " + stepsRequired);
    }}