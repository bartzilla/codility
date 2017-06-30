package Codility;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by ciprianosanchez on 6/29/17.
 */
public class PassingCars
{
    public static void main(String[] args)
    {
        int[] A = {0, 1, 0, 1};
        System.out.println("Result: " + PassingCars.solution(A));
    }

    private static int solution(int[] A)
    {

        int counter = 0;
        for(int i=0; i<A.length; i++)
        {
            if (A[i] == 0)
            {
                int[] tail = Arrays.copyOfRange(A, i, A.length);
                counter+= IntStream.of(tail).sum();
            }
        }

        return counter > 1000000 ? -1 : counter;
    }
}
