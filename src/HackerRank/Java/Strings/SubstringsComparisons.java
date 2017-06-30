package HackerRank.Java.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ciprianosanchez on 6/30/17.
 */
public class SubstringsComparisons
{
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> substrings = new ArrayList<>();

        for(int i=0; i<s.length(); i++)
        {
            for (int j = i ; j <= s.length() - k ; j += k)
            {
                substrings.add(s.substring(j, j + k));
            }
        }

        Collections.sort(substrings);
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size() -1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
