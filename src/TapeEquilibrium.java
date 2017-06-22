import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  Correctness: 100%
 *  Performance: 0%
 *  Task score:  50%
 */

public class TapeEquilibrium
{
    public static void main(String[] args)
    {
//        final int[] elements = {-1000, 1000};
        final int[] elements = {3, 1, 2, 4, 3};
        System.out.println("The minimum difference is: " + TapeEquilibrium.getMinDiff(elements));
    }

    private static int getMinDiff(final int[] A)
    {
        List<Integer> original = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> head = new ArrayList<>();
        List<Integer> tail = new ArrayList<>();
        List<Integer> results = new ArrayList<>();

        for (int i = 1; i < A.length; i++)
        {



            final int start = i;
            final int end = original.size();

            head = original.subList(0, start);
            tail = original.subList(start, end);

            int sumHeadElements = 0;
            int sumTailElements = 0;

            for (Integer value : head)
            {
                sumHeadElements += value;
            }

            for (Integer value : tail)
            {
                sumTailElements += value;
            }

            results.add(Math.abs(sumHeadElements - sumTailElements));
        }

        Collections.sort(results);

        return results.get(0);
    }

}
