/*
Mike has designed a new string sorting algorithm.

Rules:
1. Take the last character of the string and place it first.
2. Group all identical (repeating) characters together while
   maintaining the order in which each distinct character first appears.

Example:
Input  : "banana"
Step 1 : Last character 'a' is placed first.
Step 2 : Group identical characters together.

Output : "aaannb"   // (depending on the exact grouping rule)
*/

import java.util.Scanner;

public class MikeSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Step 1: Put the last character first
        char lastChar = str.charAt(str.length() - 1);
        result.append(lastChar);

        // Add the remaining characters
        for (int i = 0; i < str.length() - 1; i++) {
            result.append(str.charAt(i));
        }

        // Step 2: Group repeating characters together
        StringBuilder grouped = new StringBuilder();
        boolean[] visited = new boolean[256];

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);

            if (!visited[ch]) {
                visited[ch] = true;

                int count = 0;
                for (int j = 0; j < result.length(); j++) {
                    if (result.charAt(j) == ch) {
                        count++;
                    }
                }

                // Append the character 'count' times
                for (int k = 0; k < count; k++) {
                    grouped.append(ch);
                }
            }
        }

        System.out.println("Sorted String: " + grouped);
    }
}

/*
Logic:

1. Read the input string.

2. Move the last character of the string to the beginning.
   - Store the last character.
   - Append the remaining characters after it.

3. Traverse the new string from left to right.

4. For every character that has not been processed:
   - Count how many times it appears in the string.
   - Append that character to the output exactly 'count' times.
   - Mark the character as visited so it is not counted again.

5. Print the final grouped string.

Time Complexity: O(n²)
Space Complexity: O(1)   // O(256) for the visited array
*/