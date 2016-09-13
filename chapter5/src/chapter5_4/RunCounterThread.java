package chapter5_4;


/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class RunCounterThread {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread((Runnable) new ThreadCounter());
        Thread t2 = new Thread((Runnable) new ThreadCounter());
        Thread t3 = new Thread((Runnable) new ThreadCounter());
        Thread t4 = new Thread((Runnable) new ThreadCounter());
        Thread t5 = new Thread((Runnable) new ThreadCounter());
        Thread t6 = new Thread((Runnable) new ThreadCounter());
        Thread t7 = new Thread((Runnable) new ThreadCounter());
        Thread t8 = new Thread((Runnable) new ThreadCounter());
        Thread t9 = new Thread((Runnable) new ThreadCounter());
        Thread t10 = new Thread((Runnable) new ThreadCounter());
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t5.setName("T5");
        t6.setName("T6");
        t7.setName("T7");
        t8.setName("T8");
        t9.setName("T9");
        t10.setName("T10");
        runThread(t1);
        runThread(t2);
        runThread(t3);
        runThread(t4);
        runThread(t5);
        runThread(t6);
        runThread(t7);
        runThread(t8);
        runThread(t9);
        runThread(t10);
    }
    
    static void runThread(Thread thread) throws InterruptedException{
        thread.start();
        thread.join();
    }
}
