package Fastfail;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wb-cengyanyu on 2016/5/23.
 */
public class fastfailtest {
    private static int hh;

    private static ArrayList<String> arrayList=new ArrayList<String>();//static���εĺ���ֻ�ܷ���static���εı���,��Ϊjvm����˳�򣬾�̬Ϊ�ȵġ��Ǿ�̬�Ķ���ֻ��ʹ��newһ������Ŵ��ڡ�
    private static class thread1 extends Thread{
        public void run(){
            Iterator<String> integer=arrayList.iterator();
            while (integer.hasNext()){
                String temp=integer.next();
                System.out.println("thread  one:"+temp);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class  thread2 extends Thread{
        public void run(){
            Iterator<String> integer=arrayList.iterator();
            for (int i=1;i<=10;i++){
                System.out.print("threrad two:"+i);
                if(i==3){
                    arrayList.remove(i);
                }

            }
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            arrayList.add(""+i);
        }
        System.out.println(arrayList);
        new thread1().start();
        new thread2().start();
    }
}
