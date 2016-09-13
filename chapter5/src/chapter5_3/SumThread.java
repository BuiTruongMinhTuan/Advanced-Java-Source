package chapter5_3;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class SumThread extends Thread {

    public SumThread(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    

    

    private int n;
    private int[] arr;
    private int max = 0;

    //override run method
    @Override
    public void run() {
        for (int i = 0; i < this.n; i++) {
            max = Math.max(arr[i], this.max);
        }
    }

    public SumThread(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }
}
