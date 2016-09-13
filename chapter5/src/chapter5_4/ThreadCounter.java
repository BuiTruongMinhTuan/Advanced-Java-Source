package chapter5_4;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class ThreadCounter extends Thread {

    private static int count = 0;

    @Override
    public void run() {

        // call synchronized counter function 
        try {
            counter();

        } catch (InterruptedException e) {
            System.err.printf(e.toString());
        }
    }

    public synchronized void counter() throws InterruptedException {
        int temp = 0;
        while (true) {

            System.out.println("thread running : " + Thread.currentThread().getName());
            count++;
            System.out.println("count is " + count + "\n");

            
            temp++;
            if (temp == 10) {
                break;
            }
            // After count is 10 make the current thread go to sleep
            Thread.currentThread().sleep(50);
        }
    }
}