import java.util.Scanner;

/* riya likes to play number games 
today she decided to find the largest number that can be made by the digits in the given number
sort the ascending string to ascending to get the largest number 

for eg 
given = 3675092
sort it from ascending order 9765320 */

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        String number = sc.nextLine();
        
        sc.close();
        
        char[] digits = number.toCharArray();
        java.util.Arrays.sort(digits);
        String largestNumber = new StringBuilder(new String(digits)).reverse().toString();
        System.out.println("The largest number that can be made is: " + largestNumber);
    }
}