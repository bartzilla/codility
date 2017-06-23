import java.util.Arrays;

/*
 *  Correctness: 100%
 *  Performance: 100%
 *  Task score:  100%
 */
public class PermCheck
{
    public static void main(String[] args)
    {
        final int[] A = {4, 1, 3, 2, 5, 5};

        System.out.println("Is a permutation: " + PermCheck.isAPermutation(A));
    }

    private static int isAPermutation(final int[] A)
    {
        Arrays.sort(A);

        for(int i=0; i<A.length; i++)
        {
            if(i + 1 != A[i])
            {
                return 0;
            }
        }

        return 1;
    }
}
