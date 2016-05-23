package ThreadABC;

/**
 * Created by wb-cengyanyu on 2016/4/21.
 */
public class ThreadABC  extends Thread{
    private String name;
    private Object self;
    private Object prev;
    public ThreadABC(String name,Object self,Object prev){
        this.name=name;
        this.self=self;
        this.prev=prev;
    }
    public void run(){
        int count=1;
        while (count<=10) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count++;
                    self.notify();
                }
                try {
                    prev.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadABC threada=new ThreadABC("a",a,c);
        ThreadABC threadb=new ThreadABC("b",b,a);
        ThreadABC threadc=new ThreadABC("c",c,b);
        threada.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadb.start();

        threadc.start();


    }
}
