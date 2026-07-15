import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        int[] arr = new int[N - 1];

        System.out.println("Enter elements of the Array:");
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The expected sum is: " + expectedSum);
        System.out.println("The actual sum is: " + actualSum);
        System.out.println("The missing number is: " + expectedSum + " - " + actualSum + " = " + missingNumber);

        sc.close();
    }
}