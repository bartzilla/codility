import java.util.Arrays;
import java.util.stream.IntStream;

/*
 *  Correctness: 100%
 *  Performance: 0%
 *  Task score:  50%
 */

public class TapeEquilibrium
{
    public static void main(String[] args)
    {
        final int[] elements = {3, 1, 2, 4, 3};

        Integer a = 128;
        Integer b = 128;

        System.out.println(a == b);
//        System.out.println("The minimum difference is: " + TapeEquilibrium.getMinDiff(elements));
    }

    private static int getMinDiff(final int[] A)
    {
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < A.length; i++)
        {
            final int start = i;
            final int end = A.length;

            int[] head = new int[start];
            int[] tail = new int[end - start];

            head = Arrays.copyOfRange(A, 0, start);
            tail = Arrays.copyOfRange(A, start, end);

            int sumHeadElements = IntStream.of(head).sum();
            int sumTailElements = IntStream.of(tail).sum();

            int diff = Math.abs(sumHeadElements - sumTailElements);

            if (diff < minDiff)
            {
                minDiff = diff;
            }
        }

        return minDiff;
    }

}
