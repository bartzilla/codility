package Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Correctness: 100%
 *  Performance: not assessed
 *  Task score: 100%
 */
public class BinaryGap
{
    public static void main(String[] args)
    {
        System.out.println("Biggest gap is: " + solution(1376796946));
    }

    /*
     *  Correctness: 100%
     *  Performance: not assessed
     *  Task score: 100%
     */

    public int solution2(int N) {
        String binary = Integer.toBinaryString(N);

        List<Integer> counts = new ArrayList<>();
        int counter = 0;

        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1' && counter > 0) {
                counts.add(counter);
                counter = 0;
            } else if(binary.charAt(i) == '0' && i > 0) {
                counter++;
            }
        }

        Collections.sort(counts);
        return counts.isEmpty() ? 0 : counts.get(counts.size() - 1);

    }

    private static int solution(int N)
    {
        String binary = Integer.toBinaryString(N);
        System.out.println(N + " in binary is " + binary );
        int counter = 0;
        int biggestGap = 0;

        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                for(int j=i+1; j<= binary.length() - 1; j++)
                {
                    if(binary.charAt(j) == '0')
                    {
                        if(j == binary.length())
                        {
                            return biggestGap;
                        }

                        counter++;
                        continue;
                    }

                    if (counter > biggestGap)
                    {
                        biggestGap = counter;
                    }
                    counter = 0;
                    i = j - 1;
                    break;
                }
            }
        }

        return biggestGap;
    }
}
