package HackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class LeftRotation
{
/*
Input
5 4
1 2 3 4 5

Output
5 1 2 3 4
 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> shifted = aList.subList(k, aList.size());
        shifted.addAll(aList.subList(0, k));

        for (Integer value : shifted)
        {
            System.out.print(value + " ");
        }

    }

}
