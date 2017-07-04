package HackerRank.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by ciprianosanchez on 7/2/17.
 */
public class Staircase
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        String arr[][] = new String[a][a];
        int counter = arr.length;

        for(int i =0; i<arr.length; i++)
        {
            counter--;
            for(int j=0; j<arr.length; j++)
            {
                if (j>=counter)
                {

                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
