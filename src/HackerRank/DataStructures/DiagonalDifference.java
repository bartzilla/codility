package HackerRank.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * Created by ciprianosanchez on 7/1/17.
 */
public class DiagonalDifference
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ar = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j =0; j<n; j++)
            {
                ar[i][j] = in.nextInt();
            }
        }

        System.out.println(sumDiagonals(ar));
    }

    static int sumDiagonals(int[][] ar) {

        int sumA = 0;
        int sumB = 0;

        for(int i=0; i<ar.length; i++)
        {
            for(int j=i; j<=i; j++)
            {
                sumA += ar[i][j];
            }
        }

        int counter = -1;
        for(int i=ar.length - 1; i>= 0; i--)
        {
            counter++;
            sumB += ar[i][counter];
        }

        return Math.abs(sumA - sumB);
    }
}
