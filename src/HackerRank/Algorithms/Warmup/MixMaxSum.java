package HackerRank.Algorithms.Warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ciprianosanchez on 7/2/17.
 */
public class MixMaxSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long sum = 0;
        List<Long> results = new ArrayList<>();

        for (int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }

        for(int i=0; i<arr.length; i++)
        {
            results.add(sum - arr[i]);
        }

        Collections.sort(results);

        System.out.print(results.get(0) + " " + results.get(results.size() - 1));
    }
}
