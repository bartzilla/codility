package HackerRank.DataStructures;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ciprianosanchez on 7/1/17.
 */
public class PlusMinus
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }

        calculateFractions(ar);
    }

    static void calculateFractions(int[] ar)
    {
        double[] stats = new double[3];

        for (int element : ar)
        {
            if (element < 0)
            {
                stats[0]++;
            } else if (element == 0)
            {
                stats[1]++;
            } else if (element > 0)
            {
                stats[2]++;
            }
        }

        System.out.printf("%.6f", stats[2] / (double) ar.length);
        System.out.println();
        System.out.printf("%.6f" ,stats[0] / (double) ar.length);
        System.out.println();
        System.out.printf("%.6f", stats[1] / (double) ar.length);
        System.out.println();

    }
}
