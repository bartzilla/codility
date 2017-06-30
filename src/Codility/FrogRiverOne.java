package Codility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 *  Correctness: 100%
 *  Performance: 100%
 *  Task score:  100%
 */

public class FrogRiverOne
{
    public static void main(String[] args)
    {
        final int[] A = {3};
        final int X = 5;

        System.out.println("The earliest time is: " + FrogRiverOne.getEarliestTime(X, A));
    }

    private static int getEarliestTime(final int X, final int[] A)
    {
        Map<Integer, Integer> leaves = new HashMap<>();

        for (int i = A.length - 1; i >= 0 ; i--)
        {
            leaves.put(A[i] - 1, i);
        }

        return leaves.size() != X ? -1 : Collections.max(leaves.values());
    }
}
