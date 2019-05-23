package Thread.ThreadDemo;

import java.util.ArrayList;

/**
 * Created by wb-cengyanyu on 2016/4/18.
 */
class Threadtest implements Runnable {
    private static int count;


    public Threadtest() {
        count = 0;
    }

    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
    public static void main(String args[]){
        Threadtest syncThread = new Threadtest();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}
