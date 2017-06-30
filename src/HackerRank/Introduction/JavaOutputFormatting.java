package HackerRank.Introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            String col = String.format("%-" + 15 +"s", s1);
            String xString = String.valueOf(x);
            int xStringLength = xString.length();

            for(int j=xStringLength; j<3; j++)
            {
                xString = "0" + xString;
            }


            System.out.println(col + xString);
        }
        System.out.println("================================");

    }
}
