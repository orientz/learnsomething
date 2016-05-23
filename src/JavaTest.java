/**
 * Created by wb-cengyanyu on 2016/5/4.
 */
public class JavaTest {

    static int m = 1024 * 1024;

    public static void main(String[] args) {
        //·ÖÅä2Õ×
        byte[] a1 = new byte[2 * m];
        System.out.println("a1 ok");
        //·ÖÅä2Õ×
        byte[] a2 = new byte[2 * m];
        System.out.println("a2 ok");
       // System.gc();
        //·ÖÅä2Õ×
        byte[] a3 = new byte[4 * m];
        System.out.println("a2 ok");

    }
}
