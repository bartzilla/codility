package HackerRank.Java.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by ciprianosanchez on 6/30/17.
 */
public class Substring
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));

    }
}
