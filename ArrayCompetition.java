//HOMEWORK QUESTION
/* 
A good array is one that is:
a1 < a2 < ... < ak > ak+1 > ... > aN
for some 1 <= k <= N.

Operation:
Choose any element > 0 and decrease it by 1 any number of times.

Approach:
Try every index as the peak.

For a fixed peak:
1. Keep the peak unchanged.
2. Move left from the peak:
   Each element must be strictly smaller than the next one.
   So set:
       value = min(originalValue, nextValue - 1)
3. Move right from the peak:
   Each element must be strictly smaller than the previous one.
   So set:
       value = min(originalValue, previousValue - 1)
4. If any value becomes negative, that peak is impossible.
5. If any peak works, print "Yes", otherwise print "No".

Time Complexity: O(N²)
Space Complexity: O(N)
*/

import java.util.Scanner;

public class ArrayCompetition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        boolean possible = false;

        for (int peak = 0; peak < N && !possible; peak++) {

            int[] temp = new int[N];
            boolean ok = true;

            temp[peak] = A[peak];

            // Left side (strictly increasing towards peak)
            for (int i = peak - 1; i >= 0; i--) {
                temp[i] = Math.min(A[i], temp[i + 1] - 1);
                if (temp[i] < 0) {
                    ok = false;
                    break;
                }
            }

            // Right side (strictly decreasing after peak)
            if (ok) {
                for (int i = peak + 1; i < N; i++) {
                    temp[i] = Math.min(A[i], temp[i - 1] - 1);
                    if (temp[i] < 0) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok) {
                possible = true;
            }
        }

        System.out.println(possible ? "Yes" : "No");
    }
}