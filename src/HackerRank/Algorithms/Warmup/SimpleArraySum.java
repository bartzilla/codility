package HackerRank.Algorithms.Warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        List<Integer> intList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        int sum = intList.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
