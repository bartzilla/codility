package Codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        System.out.println(OddOccurrencesInArray.solution2(array));
    }

    /*
     *  Correctness: 100%
     *  Performance: 100%
     *  Task score:  100%
     */
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

    /*
     *  Correctness: 100%
     *  Performance: 100%
     *  Task score:  100%
     */
    private static int solution2(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<A.length; i++){
            if(map.get(A[i]) != null){
                int counter = map.get(A[i]) + 1;
                map.put(A[i], counter);
            } else {
                map.put(A[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if(pair.getValue() % 2 != 0) {
                return pair.getKey();
            }
        }

        return -1;
    }

}
