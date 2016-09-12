
package chapter4_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.print.Collation;

/*
 * @author Bui Truong Minh Tuan
 * Date : 12/9/2016
 * Version : 1.0
 * 
 */
public class StreamString {

   //to run program
    public static void main(String[] args) {
        //create array String1
        List<String> listString1 = Arrays.asList("123456", "a", "3", "Happy", "5", "bas", "7","8",
                                                "Happy", "10", "", "abf", "", "14","15");
        //output array String1
        System.out.println("StreamS1:");
        Stream<List> StreamS1= Stream.of(listString1);
        StreamS1.forEach(System.out::print);
        
        //find " " in array String1
        int countNull = (int) listString1.stream().filter(string -> string.isEmpty()).count();
        System.out.println("\nCount Null in Array = " + countNull);
        
        //find Length over 5 in array String1
        int countLeght5 = (int) listString1.stream().filter(string -> string.length()>5).count();
        System.out.println("\nCount Length over 5 = " + countLeght5);
        
        //Count Start With A in array String1
        int countStartWithA = (int) listString1.stream().filter(string -> string.startsWith("a", 0)).count();
        System.out.println("\nCount Start With A = " + countStartWithA);
        
        //Count Is Happy in array String1
        int countIsHappy= (int) listString1.stream().filter(string -> string.matches("Happy")).count();
        System.out.println("\nCount s Happy in array = " + countIsHappy);
        
        //create array String2 not Empty from array String1
        List<String> listString2= listString1.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
    
         //output array String2
         System.out.println("\nStreamS2:");
        Stream<List> StreamS2= Stream.of(listString2);
        StreamS2.forEach(System.out::print);
        
        //create array String3 with length >2 & <7 from array String1
        List<String> listString3= listString1.stream().filter(string->string.length()>2 &&string.length()<7).collect(Collectors.toList());
        
        //output array String3 with Merged String
        String mergedString =listString3.stream().collect(Collectors.joining(","));
        System.out.println("\n\nStreamS3:");
        System.out.println("Merged String: "+mergedString);
        
        //create array String4 bouns happy from array String1
        List<String> listString4= listString1.stream().map(string->string+"happy").collect(Collectors.toList());
        
        //output array String4
         System.out.println("\nStreamS4:");
        Stream<List> StreamS4= Stream.of(listString4);
        StreamS4.forEach(System.out::print);
    }
    
    
}
