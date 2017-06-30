package HackerRank.Java.Strings;

import java.io.*;
import java.util.*;
public class Introduction
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(sumLength(A, B));
        System.out.println(compareLexicographically(A, B));
        System.out.println(capitalizeFirstLetter(A, B));

    }

    private static int sumLength(String a, String b)
    {
        return a.length() + b.length();
    }

    private static String compareLexicographically(String a, String b)
    {
        if (a.compareTo(b) >= 1)
        {
            return "Yes";
        }
        return "No";
    }

    private static String capitalizeFirstLetter(String a, String b)
    {
        String capitalizedA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedB = b.substring(0, 1).toUpperCase() + b.substring(1);

        return capitalizedA + " " + capitalizedB;
    }
}
