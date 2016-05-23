package Extendstest;

/**
 * Created by wb-cengyanyu on 2016/4/15.
 */
public class Son extends Father{
    public Son(String name){
        super(name);
        System.out.println(this.name1);
    }
    public static void main(String args[]){
        Son son=new Son("zyy");
    }
}
