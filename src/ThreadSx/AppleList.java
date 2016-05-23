package ThreadSx;

/**
 * Created by wb-cengyanyu on 2016/4/22.
 */
public class AppleList {
     int index=0;
    Apple[] Apple=new Apple[5];
    public synchronized void pro(){
        while (index>=5) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            Apple[index] = new Apple(index);
             System.out.println("生产了" + Apple[index].geti());
            index++;
            notify();

    }
    public synchronized void pop(){
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("消费了" + Apple[index-1].geti());
        Apple[index-1]=null;
        index--;

            notify();


    }
}
