
package chapter5_1;

/*
 * @author Bui Truong Minh Tuan
 * Date : 13/9/2016
 * Version : 1.0
 * 
 */
public class ThreadDemo extends Thread{

   
   private Thread thread;
   private String threadName;
   
   //create thread
    public ThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating "+threadName);
    }
    
    //override run method
    @Override
    public void run(){
        System.out.println("Running "+ threadName);
        try {
            for(int i = 3; i> 0; i--){
                System.out.println("Thread: "+threadName + ", "+ i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+ threadName+" interrupted.");
        }
        System.out.println("Thread "+threadName+" exiting.");
        
    }
    
    //override start method
    @Override
    public void start(){
        System.out.println("Starting "+ threadName );
        if(thread == null){
            thread = new Thread (this, threadName);
            thread.start();
        }
    }
   
   
    
}
