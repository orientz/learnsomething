package Sort;

import java.math.BigInteger;
import java.util.Vector;

public class QuickSort {

    public  void quicksort(int[] a,int left,int right,int k){
        if(left<right) {
            int length=a.length;
            System.out.println();
            System.out.println("new:"+k);
            for(int i=0;i<length;i++){
                System.out.print(a[i]+" ");
            }
            k++;
            int l = left;
            int r = right;
            int key = a[l];
            while (l < r) {
                while (l < r && a[r] > key) {
                    r--;
                }
                a[l] = a[r];
                while (l < r && a[l] < key) {
                    l++;
                }
                a[r] = a[l];
            }
            a[l] = key;
            quicksort(a, left, l - 1, k);
            quicksort(a, l + 1, right, k);
        }
    }
    public BigInteger jieceng(BigInteger a){
        System.out.println(BigInteger.ZERO.compareTo(a));
       if(BigInteger.ZERO.compareTo(a)!=0){
           return a.multiply(jieceng(a.subtract(BigInteger.ONE)));
       }else{
           return BigInteger.ONE;
       }
    }
    public static void main(String[] args) {
        int a[]={14,50,72,31,52,6,8,23,94};
        int length=a.length;
        QuickSort zyy=new QuickSort();
        System.out.println("old:");
        for(int i=0;i<length;i++){
            System.out.print(a[i]+" ");
        }
        zyy.quicksort(a,0,length-1,1);
        System.out.println("");
        System.out.println("new:");
        for(int i=0;i<length;i++){
            System.out.print(a[i]+" ");
        }
        Vector<Integer> aa=new Vector<Integer>(222);
        String bb="10";
        BigInteger bbb=new BigInteger(bb);
        System.out.println(bbb);
        System.out.println("**************"+zyy.jieceng(bbb));
        BigInteger ab;
    }


}
