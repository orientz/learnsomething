/**
 * Created by wb-cengyanyu on 2016/5/4.
 */
public class JavaTest {

    static int m = 1024 * 1024;

    public static void main(String[] args) {
        //����2��
        byte[] a1 = new byte[2 * m];
        System.out.println("a1 ok");
        //����2��
        byte[] a2 = new byte[2 * m];
        System.out.println("a2 ok");
       // System.gc();
        //����2��
        byte[] a3 = new byte[4 * m];
        System.out.println("a2 ok");

    }
}
