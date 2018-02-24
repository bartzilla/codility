package HackerRank.Algorithms.Warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ciprianosanchez on 7/2/17.
 */
public class Staircase
{
    public static void main(String[] args) throws ParseException
    {

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy");
        Date theDate = sdf.parse ("Mon Mar 4 12:33:58 2013");
        long minutes2 = theDate.getTime() / 60000;

        System.out.println(minutes2);

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//
//        String arr[][] = new String[a][a];
//        int counter = arr.length;
//
//        for(int i =0; i<arr.length; i++)
//        {
//            counter--;
//            for(int j=0; j<arr.length; j++)
//            {
//                if (j>=counter)
//                {
//
//                    System.out.print("#");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
