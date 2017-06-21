import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation
{
    public static void main(String[] args)
    {
        final int[] array = {1, 1, 2, 3, 5};

        int[] shifted = CyclicRotation.solution(array, 42);

        for (int i : shifted)
        {
            System.out.print(" " + i);
        }
    }

    private static int[] solution(final int[] A, int K)
    {
        int from = 0;

        if (A.length == 0)
        {
            return A;
        }

        if (A.length < K)
        {
            from =  A.length  - K % A.length;
        }else
        {
            from = A.length - K;
        }

        int to = A.length;

        List<Integer> originalArray = Arrays.stream(A).boxed().collect(Collectors.toList());

        List<Integer> shiftedArray = originalArray.subList(from, to);
        List<Integer> detachedHead = originalArray.subList(0, from);

        shiftedArray.addAll(detachedHead);

        return shiftedArray.stream().mapToInt(i -> i).toArray();
    }
}
