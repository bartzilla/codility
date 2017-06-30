package Codility;

import java.util.ArrayList;
import java.util.List;

/*
 *  Correctness: 100%
 *  Performance: not assessed
 *  Task score: 100%
 */

public class BinaryGapV2
{
    public static void main(String[] args)
    {
        final int number = 255;
        System.out.println("binary representation: " + Integer.toBinaryString(number));
        System.out.println(BinaryGapV2.getLongestBinaryGap(number));
    }

    private static int getLongestBinaryGap(final int number)
    {
        final String binaryString = Integer.toBinaryString(number);
        List<Integer> indexes = new ArrayList<>();
        List<List<String>> arrayOfElements = new ArrayList<>();

        char[] chars = binaryString.toCharArray();
        List<String> binaryElements = new ArrayList<>();

        for (char aChar : chars)
        {
            binaryElements.add(String.valueOf(aChar));
        }

        for (int i = 0; i < binaryString.length(); i++)
        {
            if (binaryString.charAt(i) == '1')
            {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size() - 1; i++)
        {
            arrayOfElements.add(binaryElements.subList(indexes.get(i), indexes.get(i + 1) + 1));
        }

        int biggestGap = 0;
        int gap = 0;
        for (List<String> arrayOfElement : arrayOfElements)
        {
            gap = arrayOfElement.size() - 2;

            if (gap > biggestGap)
            {
                biggestGap = gap;
            }
        }
        return biggestGap;
    }
}
