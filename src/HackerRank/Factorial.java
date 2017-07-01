package  HackerRank;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Factorial {


    static BigInteger getFactorial(int n)
    {
        if(n == 0)
            return new BigInteger("1");

        BigInteger factorial = new BigInteger("1");

        for(int i=n; i>1; i--)
        {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }

        return factorial;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named HackerRank.DataStructures.DiagonalDifference. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(getFactorial(n));
    }
}