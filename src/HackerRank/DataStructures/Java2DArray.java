package HackerRank.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(getLargetHourGlasSum(arr));

    }

    private static int[][] getHourGlass(int[][] arr, int row, int col)
    {

        int[][] hourGlass = new int[3][3];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                hourGlass[i][j] = arr[row + i][col + j];
            }
        }
        return hourGlass;
    }

    private static int getLargetHourGlasSum(int[][] arr)
    {
        int greater = Integer.MIN_VALUE;

        for(int row=0; row<4; row++)
        {
            for(int col=0; col<4; col++)
            {
                int[][] hourGlass = getHourGlass(arr, row, col);

                int sum = 0;

                for(int i=0; i<3; i++)
                {
                    for(int j=0; j<3; j++)
                    {
                        if(!((i == 1 && j == 0 ) || (i == 1 && j == 2)))
                        {
                            sum += hourGlass[i][j];
                        }
                    }
                }

                if (sum > greater)
                {
                    greater = sum;
                }

            }
        }
        return greater;
    }
}
