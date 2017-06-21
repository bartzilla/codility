import java.util.Arrays;

/*
 *  Correctness: 100%
 *  Performance: 100%
 *  Task score:  100%
 */
public class OddOccurrencesInArray
{
    public static void main(String[] args)
    {
        final int[] array = {9, 3, 9, 3, 10, 7, 10};

        System.out.println(OddOccurrencesInArray.solution(array));
    }

    private static int solution(final int[] A)
    {
        Arrays.sort(A);

        for(int i=0; i<A.length - 1; i=i+2)
        {
            if (A[i] != A[i + 1])
            {
                return A[i];
            }
        }

        return A[A.length - 1];
    }

}
