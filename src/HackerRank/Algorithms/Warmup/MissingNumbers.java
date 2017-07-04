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
        String[]arr = {"{{}}()", "{]}))"};

        braces(arr);

    }

/*
 * Complete the function below.
 */

    static String[] braces(String[] values) {

//        List<String> vList = new ArrayList<>();
        List<String> elements = new ArrayList<>();
        List<String> results = new ArrayList<>();

        for(int i=0; i<values.length; i++){
            elements.add(values[i]);
        }

        for(String o: elements){

            List<Character> vList = new ArrayList<>();
            char[] braces = o.toCharArray();

            for (char b : braces)
            {
                vList.add(b);
            }

            for(int i=0; i<braces.length; i++){
                if(vList.contains(braces[i])){
                    vList.remove(new Character(braces[i]));
                }
            }

            if(vList.size() != 0){
                results.add("NO");
            }
            else{
                results.add("YES");
            }
        }


        return results.toArray(new String[0]);

    }


}
