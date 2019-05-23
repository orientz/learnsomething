package Thread.ThreadTest;

/**
 * Created by wb-cengyanyu on 2016/4/15.
 */
public class Foo {
    private int a=100;

    public   int getA() {
        return a;
    }


    public   int  fix(int y) {
        System.out.println(Thread.currentThread().getName() + ":" + a);
        synchronized(this){

            a = a - y;

        }
        System.out.println(Thread.currentThread().getName() + ":" + a);
        return a;
    }
//    public synchronized int fix(int y){
//        System.out.println(Thread.currentThread().getName() + ":" + a);
//        a = a - y;
//        System.out.println(Thread.currentThread().getName() + ":" + a);
//        return a;
//    }
}
