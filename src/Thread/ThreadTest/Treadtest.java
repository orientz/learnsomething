package Thread.ThreadTest;

/**
 * Created by wb-cengyanyu on 2016/4/15.
 */
public class Treadtest  extends Thread{
    public Treadtest(String name){
        super(name);
        System.out.println(name);
    }
    public void run(){
        for(int i=0;i<10;i++){
            for(long k= 0; k <100000000;k++);
            System.out.println(this.getName()+":"+i);
        }
    }
    public static  void main(String args[]) throws InterruptedException {
        Treadtest t1=new Treadtest("t1");
        Treadtest t2=new Treadtest("t2");

        t1.start();

        t2.start();
        t2.join();
        System.out.println("*********");
    }
}
