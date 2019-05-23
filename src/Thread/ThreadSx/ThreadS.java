package Thread.ThreadSx;

import java.lang.reflect.Array;

/**
 * Created by wb-cengyanyu on 2016/4/22.
 */
public class ThreadS extends Thread{

    public AppleList ss;

    public ThreadS(AppleList ss){
        this.ss=ss;
    }
    public void run(){
        for (int i = 1; i <= 10; i++){
            ss.pro();

        }
    }
}
