import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ciprianosanchez on 6/28/17.
 */
public class MissingInteger
{
    public static void main(String[] args)
    {
//        int[] A = {1, 3, 6, 4, 5, 2};
//        int[] A = {2};
//        int[] A = { 0, 1, 2,3,4,5,6,7,8,9,10};
//        int[] A = {90, 91, 92, 93};
        int[] A = {116, 125, 198, 83, 0, 91, 52, 189, 54, 34, 92, 115, 1, 25, 165, 36, 141, 24, 124, 173, 80, 73, 95, 159, 4, 61, 3, 156, 28, 121, 148, 31, 76, 119, 122, 15, 72, 49, 26, 171, 81, 57, 10, 35, 117, 55, 40, 11, 161, 192, 130, 188, 12, 152, 43, 135, 62, 162, 111, 102, 140, 13, 59, 178, 160, 158, 32, 176, 17, 200, 145, 170, 150, 167, 71, 41, 181, 114, 154, 7, 42, 86, 82, 77, 68, 63, 106, 110, 120, 127, 69, 191, 21, 14, 90, 139, 46, 5, 79, 23, 197, 185, 53, 155, 112, 9, 194, 22, 51, 157, 2, 8, 142, 179, 174, 58, 199, 37, 143, 98, 65, 153, 182, 85, 105, 164, 94, 93, 131, 87, 109, 38, 187, 30, 19, 184, 113, 50, 186, 104, 132, 196, 75, 163, 78, 99, 169, 84, 48, 128, 175, 183, 100, 56, 96, 44, 107, 64, 103, 137, 151, 74, 39, 33, 29, 6, 190, 180, 118, 149, 195, 177, 168, 129, 126, 97, 144, 134, 108, 133, 16, 136, 70, 146, 47, 67, 89, 45, 138, 27, 60, 123, 166, 18, 172, 147, 88, 20, 193, 66};
        System.out.println("Result: " + MissingInteger.getMinimunInteger(A));
    }

    public static int getMinimunInteger(int[] A)
    {

        Arrays.sort(A);
        int startIndex = -1;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > 0)
            {
                startIndex = i;
                break;
            }
        }

        if (startIndex < 0)
        {
            return 1;
        }

        List<Integer> positives = Arrays.stream(Arrays.copyOfRange(A, startIndex, A.length)).boxed().collect(Collectors.toList());
        List<Integer> positiveSet = positives.parallelStream().distinct().collect(Collectors.toList());

        for (int i = 0; i < positiveSet.size(); i++)
        {
            if (positiveSet.get(i) != i + 1)
            {
                return i + 1;
            }
        }

        return positiveSet.get(positiveSet.size() - 1) + 1;

    }
}
