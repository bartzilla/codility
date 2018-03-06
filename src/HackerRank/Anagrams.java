package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagrams
{
/*
cde
abc
 */

    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
        System.out.println(numberNeeded("abc", "abc"));
    }

    public static int numberNeeded(String first, String second)
    {
        List<Character> firstList = new ArrayList<>();
        List<Character> secondList = new ArrayList<>();

        for (char c : first.toCharArray())
        {
            firstList.add(c);
        }

        for (char c : second.toCharArray())
        {
            secondList.add(c);
        }

        for (char c : first.toCharArray())
        {
            if (secondList.contains(c))
            {
                firstList.remove((Character) c);
                secondList.remove((Character) c);
            }
        }

        return firstList.size() + secondList.size();
    }
}
