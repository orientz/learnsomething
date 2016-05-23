package FatherSon;

import Extendstest.*;
import sun.rmi.server.LoaderHandler;

/**
 * Created by wb-cengyanyu on 2016/4/18.
 */
public  class  Son extends Father {
    public int a=10;
    public Son(){
        System.out.println("this is son");
        showname("zyy");
    }
    public void showname(String name){
        System.out.println("this is son's name:"+name);
    }
    public void son(String name){
        System.out.println("this is son's unique name:"+name);
    }
    public  void a(){
        System.out.println("a:"+a);
    }
    public static void main(String args[]){
        Father father= new Son();//先建一个父类再建一个子类
        father.showname("zcf");
        Son son=new Son();
        Father f=son;
        f.a();
        f.showfather("hh");
        System.out.println(f.a);
        son.showfather("dd");
        Class c=son.getClass();
        ClassLoader loader=c.getClassLoader();
        System.out.println(loader.toString());
        System.out.println(loader.getParent().toString());
        System.out.println(loader.getParent().getParent().toString());

    }
}
