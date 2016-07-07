package RTTI;

/**
 * Created by wb-cengyanyu on 2016/6/2.
 */
class son{
    private String name;
    void showname(String name){
        System.out.println("son::"+name);
    }
}
public class Rttitest extends son{
    void showname(String name){
        System.out.println("this:::"+name);
    }

    public static void main(String[] args) {
        son son=new son();
        son.showname("zyy");
    }
}

