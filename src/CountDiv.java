/**
 * Created by ciprianosanchez on 6/29/17.
 */
public class CountDiv
{
    public static void main(String[] args)
    {
        int A = 0;
        int B = 11;
        int K = 2;

        System.out.println("Result: " + CountDiv.getDivs(A, B, K));
    }

    private static int getDivs(int A, int B, int K)
    {
        int counter = 0;
        for(int i=A; i<=B; i++)
        {
            if (i % K == 0)
            {
                counter++;
            }
        }

        return counter;
    }
}
