package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * Created by ciprianosanchez on 6/30/17.
 */
public class Arrays
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        for(int i=a.length - 1; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }

}
