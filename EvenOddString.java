/*The Q says the string is given and we have to find the frequency of each element 
and if the element in continuation occurs even number of times then we 
count it and if it occurs odd number of times then we don't count it and print the final count of
is the sum of the all even times occuring characters in the string.*/

import java.util.Scanner;

public class EvenOddString{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            int freq = 1;
            while(i+1<str.length() && str.charAt(i) == str.charAt(i+1))
            {
                freq++;
                i++;
            }
            if(freq % 2 == 0)
            {
                count += freq;
            }
        }
        System.out.println("The final count of even occurring characters is: " + count);
    }
    
}