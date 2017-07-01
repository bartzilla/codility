import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by ciprianosanchez on 6/30/17.
 */
public class UtilLists
{
    public static void main(String[] args)
    {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumArray = IntStream.of(intArray).sum();

        List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        int sum = intList.stream().mapToInt(Integer::intValue).sum();
        int[] backToArrayInt = intList.stream().mapToInt(i -> i).toArray();
//        Integer[] backToArrayInt = intList.toArray(new Integer[intList.size()]);


        String[] stringArray = {"One", "Two", "Three", "Four"};
        List<String> stringList = Arrays.asList(stringArray);
        String[] backToArrayString = stringList.toArray(new String[stringList.size()]);

        int[] convertToSet = {1, 1, 1, 1, 1};
        Set<Integer> set = IntStream.of(convertToSet).boxed().collect(Collectors.toSet());
        Set<Integer> linkedHashSet = IntStream.of(convertToSet).boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        // CONVERT INT TO BINARY
        String binary = Integer.toBinaryString(10);

        // Cover List to Set
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        Set<Integer> foo = new HashSet<>(list);
    }
}
