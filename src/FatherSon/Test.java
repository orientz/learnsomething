package FatherSon;

/**
 * Created by wb-cengyanyu on 2016/5/11.
 */
public class Test extends Son {
    Test(){
        System.out.println("Test");
    }
}
class Test2 extends Test{
    Test2(){
        System.out.println("Test2");
    }
}
class Test3  extends Test2{
    public static void main(String[] args) {
        Test3 test3=new Test3();
    }
}
