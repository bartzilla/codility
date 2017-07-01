package HackerRank.Java.Strings;

import java.io.*;
import java.util.*;
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for(int i=0; i<tokens.length; i++)
        {
            System.out.println(tokens[i]);
        }

//        StringTokenizer st = new StringTokenizer(s);
//
//        List<String> tokenList = new ArrayList<>();
//        while (st.hasMoreElements()) {
//            tokenList.add((String) st.nextElement());
//        }
//
//        System.out.println(tokenList.size());
//
//        for(String token : tokenList)
//        {
//            System.out.println(token);
//        }
    }
}