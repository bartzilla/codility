package HackerRank.Algorithms.Warmup;

import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ciprianosanchez on 7/1/17.
 */
public class MissingNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];

        for(int i = 0; i < n; i++){
            ar1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] ar2 = new int[m];
        for(int i = 0; i < m; i++){
            ar2[i] = in.nextInt();
        }

        missingNumbers(ar1, ar2);

    }

    static void missingNumbers(int[] ar1, int[] ar2)
    {

        List<Integer> ar1List = Arrays.stream(ar1).boxed().collect(Collectors.toList());
        List<Integer> ar2List = Arrays.stream(ar2).boxed().collect(Collectors.toList());
        List<Integer> missing = new ArrayList<>();

        for (int value : ar1)
        {
            if (ar2List.contains(value))
            {
                ar2List.remove(new Integer(value));
            }
        }

        for (int value : ar2)
        {
            if (ar1List.contains(value))
            {
                ar1List.remove(new Integer(value));
            }
        }

        missing.addAll(ar1List);
        missing.addAll(ar1List.size(), ar2List);
        Collections.sort(missing);

        Set<Integer> missingSet = new LinkedHashSet<>(missing);

        for(Integer val: missingSet)
        {
            System.out.print(val + " ");
        }

    }
}
