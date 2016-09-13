
package chapter5_3;


import java.util.Random;
import java.util.Scanner;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
//to run program
public class MaxOfArrayThread {
    public static void main(String[] args) throws InterruptedException{
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(101);
        }
        System.out.println("Input num of Threads: ");
        int numThreads = input.nextInt();

        int max = max(arr, numThreads);
        String strArr = "";
        for (int value : arr) {
            strArr += value + " ";
        }
        System.out.println("Array: " + strArr);
        System.out.println("Max: " + max);
    }

    //Sum of arr
    public static int max(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int max = 0;
        //create and start numThreads
        SumThread[] ts = new SumThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new SumThread((i * len) / numThreads, arr);
            ts[i].start();
        }
        //Wait for the threads to finish and max their result
        for (int i = 0; i < numThreads; i++) {
            ts[i].join();
             max = Math.max(ts[i].getMax(), max);
        }
        return max;
    }
}
