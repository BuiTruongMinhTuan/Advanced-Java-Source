package Exercise3_String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class MainforSortString {

    //to run program
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        createList(listString);
        System.out.println("----List String non sort----");
        showListString(listString);

        shortToLong(listString);
        System.out.println("----List String to Long sort----");
        showListString(listString);

        longToShort(listString);
        System.out.println("----List String to Short sort----");
        showListString(listString);

        alphabetList(listString);
        System.out.println("----List String to Alphabe sort----");
        showListString(listString);
    }

    //create random String for list
    static void createList(List<String> listString) {
        int count = 0;
        char[] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            String sCount = "";
            count = rd.nextInt(6);
            for (int j = 0; j < count + 1; j++) {
                count = rd.nextInt(6);
                sCount += arrayChar[count] + "S" + j;
            }
            listString.add(sCount);

        }
    }

    //show element in String list
    static void showListString(List<String> listString) {

        listString.forEach(s -> System.out.println(s));
        System.out.println("----------------------------");
    }

    //sort to longest
    public static List<String> shortToLong(List<String> listString) {
        List<String> shortest = listString.subList(0, listString.size());
        Comparator<String> toLong = (a, b) -> Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length()));
        shortest.sort(toLong);
        return shortest;
    }

    //long to shortest
    public static List<String> longToShort(List<String> listString) {
        List<String> longest = listString.subList(0, listString.size());
        Comparator<String> toShort = (a, b) -> Integer.valueOf(b.length()).compareTo(Integer.valueOf(a.length()));
        longest.sort(toShort);
        return longest;
    }

    //to alphabetical 
    public static List<String> alphabetList(List<String> listString) {
        List<String> alphabet = listString.subList(0, listString.size());
        Comparator<String> toAlphabe = (a, b) -> a.compareTo(b);
        alphabet.sort(toAlphabe);
        return alphabet;
    }
}
