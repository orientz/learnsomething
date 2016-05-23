/**
 * Created by wb-cengyanyu on 2016/4/12.
 */
public class Objectlearning {
    public static void testBasicType(int m) {

        System.out.println("m=" + m);//m=50

        m = 100;

        System.out.println("m=" + m);//m=100

    }

    //参数为对象，不改变引用的值 ？？？？？？

    public static void add(StringBuffer s) {

        s.append("_add");

    }



    //参数为对象，改变引用的值 ？？？？？

    public static void changeRef(StringBuffer s) {

        s = new StringBuffer("Java");

    }

    public  static  void add1(int i){
        i=i+1;
    }



    public static void main(String[] args) {

        int i = 50;

        testBasicType(i);

        System.out.println(i);//i=50

        StringBuffer sMain = new StringBuffer("init");

        System.out.println("sMain=" + sMain.toString());//sMain=init

        add(sMain);

        System.out.println("sMain=" + sMain.toString());//sMain=init_add

        changeRef(sMain);

        System.out.println("sMain=" + sMain.toString());//sMain=init_add

        add1(i);

        System.out.println(i);//i=50


    }
}
