package Fastfail;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wb-cengyanyu on 2016/5/23.
 */
public class fastfailtest {
    private static int hh;

    private static ArrayList<String> arrayList=new ArrayList<String>();//static修饰的函数只能访问static修饰的变量,因为jvm加载顺序，静态为先的。非静态的东西只有使用new一个对象才存在。
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
