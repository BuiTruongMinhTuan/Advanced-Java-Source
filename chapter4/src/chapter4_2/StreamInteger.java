package chapter4_2;

import java.lang.reflect.Array;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
 * @author Bui Truong Minh Tuan
 * Date : 12/9/2016
 * Version : 1.0
 * 
 */
public class StreamInteger {

    public static void main(String[] args) {
        //Create Random Integer
        Random random = new Random();

        //Create Random Integer array 15 element
        int[] arrayInt = random.ints(0, 10).limit(15).toArray();

        //Convert Array to List
        List<Integer> listInt1 = IntStream.of(arrayInt).boxed().collect(Collectors.toList());

        //Output List 1
        System.out.println("List integer 1:");
        listInt1.forEach(integer -> System.out.print(integer + " "));

        //Create List Integer 2 as squared from List Integer 1
        List<Integer> listInt2 = listInt1.stream().map(integer -> integer * integer).collect(Collectors.toList());

        //Output List 2
        System.out.println("\nList integer 2:");
        listInt2.forEach(integer -> System.out.print(integer + " "));

        //Add List 2 to IntSummaryStatistics
        IntSummaryStatistics summary1 = listInt2.stream().mapToInt((integer) -> integer).summaryStatistics();

        //Max value in List 2
        System.out.println("\nMax value in List 2:" + summary1.getMax());

        //Min value in List 2
        System.out.println("Min value in List 2:" + summary1.getMin());

        //Total value in List 2
        System.out.println("Total value in List 2:" + summary1.getSum());

        //Avg value in List 2
        System.out.println("Avg value in List 2:" + summary1.getAverage());

        //Create List Integer 3 as prime number from List Integer 2
        List<Integer> listInt3 = listInt2.stream()
                .filter(integer -> isPrime(integer))
                .distinct()
                .collect(Collectors.toList());

        //Output List 3
        System.out.println("\nList integer 3:");
        listInt3.forEach(integer -> System.out.print(integer + " "));

        //Create List Integer 4 as prime number from List Integer 2
        List<Integer> listInt4 = listInt2.stream()
                .filter(integer -> (int) Math.sqrt(integer) == Math.sqrt(integer)).distinct()
                .collect(Collectors.toList());

        //Output List 4
        System.out.println("\nList integer 4:");
        listInt4.forEach(integer -> System.out.print(integer + " "));
    }

    //check prime number
    private static boolean isPrime(int number) {
        IntPredicate isDivisible = index -> number % index == 0;
        return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
    }
}
