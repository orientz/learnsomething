package Thread.ThreadSx;

/**
 * Created by wb-cengyanyu on 2016/4/22.
 */
public class ThreadX extends  Thread{
    public AppleList ss;

    public ThreadX(AppleList ss){
        this.ss=ss;
    }
    public void run() {
        for (int i = 1; i <= 10; i++){
            ss.pop();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AppleList ss=new AppleList();
        ThreadS threadS=new ThreadS(ss);
        ThreadX threadX=new ThreadX(ss);
        threadS.start();

        threadX.start();
    }
}
