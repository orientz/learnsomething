package Sort;

/**
 * Created by wb-cengyanyu on 2016/4/19.
 */
public class Sort {
    public  static final  int a[] = {14, 50, 72, 31, 52, 6, 8, 23, 94};
    public  static  SelectSort selectsort;
    public  static  final  int c = 0;
    public void prt(int[] a){
        int length = a.length;
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
