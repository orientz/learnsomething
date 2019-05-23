package Thread.ThreadSafe;

import java.util.*;

/**
 * Created by wb-cengyanyu on 2016/4/19.
 */
public class ThreadSafe1 extends Thread{
     //List list= Collections.synchronizedList(new ArrayList<Integer>());
    ArrayList<Integer> list=new ArrayList<Integer>();
    public synchronized void  add(int i){
        list.add(i);

    }
    public   void remove(int i){
        list.remove(i);
    }
    public void run(){
        for(int i=0;i<5;i++) {

            add(1);
          /*  if (list.size() == 0) {
                add(1);
            } else {
                remove(0);
            }*/

        }
    }
    public static void main(String args[]){
        ThreadSafe1 threadSafe1=new ThreadSafe1();
        Thread t1=new Thread(threadSafe1,"t1");
        Thread t2=new Thread(threadSafe1,"t2");
        t1.start();
        t2.start();

    }
}
