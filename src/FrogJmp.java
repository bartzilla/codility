/*
 *  Correctness: 100%
 *  Performance: 100%
 *  Task score:  100%
 */

public class FrogJmp
{
    public static void main(String[] args)
    {
        System.out.println("The number of jumps is: " + FrogJmp.getNumberOfJumps(1, 2, 1));
    }

    private static int getNumberOfJumps(final int x, final int y, final int d)
    {
        final double gap = y - x;

        int jumps = (int) Math.ceil((gap / d));

        return jumps;
    }
}
