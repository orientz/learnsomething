package FatherSon;

/**
 * Created by wb-cengyanyu on 2016/4/18.
 */
public class Father {
    public int a=100;
    public Father(){
        System.out.println("this is father");
       // System.out.println(a);
        showname("zcf");
    }
    public void showname(String name){
        System.out.println("this is father's name:"+name);
    }
    public void showfather(String name){
        System.out.println("this is father's unique name :"+name);
    }
    public void a(){
        System.out.println("a:"+a);
    }
}
