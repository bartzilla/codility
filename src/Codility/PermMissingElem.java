package Codility;

import java.util.Arrays;

/*
 *  Correctness: 100%
 *  Performance: 100%
 *  Task score:  100%
 */
public class PermMissingElem
{
    public static void main(String[] args)
    {
        final int[] elements = {4,3,1,2};

        System.out.println("The missing number in the array is: " + PermMissingElem.getMissingElement(elements));
    }

    private static int getMissingElement(final int[] A)
    {
        if (A.length == 0)
        {
            return 1;
        }

        Arrays.sort(A);

        for(int i=0; i<A.length; i++)
        {
            int sequence = i + 1;
            if(A[i] != sequence)
            {
                return sequence;
            }
        }

        return A.length + 1;
    }
}
