import java.util.*;
import java.util.stream.Collectors;

/*
 *  Correctness: 100%
 *  Performance: 0%
 *  Task score:  54%
 */

public class FrogRiverOne
{
    public static void main(String[] args)
    {
//        final int[] A = {1, 3, 1, 3, 2, 1, 3};
        final int[] A = {1, 3, 1, 3, 1, 1, 2};
        final int X = 3;

        System.out.println("The earliest time is: " + FrogRiverOne.getEarliestTime(X, A));
    }

    private static int getEarliestTime(final int X, final int[] A)
    {

        List<Integer> elementsToSearch = new ArrayList<>();

        for(int i=0; i<X; i++)
        {
            elementsToSearch.add(i + 1);
        }

        for(int i=X; i<=A.length; i++)
        {
            List<Integer> temp = Arrays.stream(A).boxed().collect(Collectors.toList()).subList(0, i);

            Collections.sort(temp);

            Set<Integer> uniqueElements = new TreeSet<>();

            uniqueElements.addAll(temp);

            if (temp.containsAll(elementsToSearch))
            {
                return i - 1;
            }
        }

        return -1;
    }
}
