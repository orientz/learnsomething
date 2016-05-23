package Sort;

/**
 * Created by wb-cengyanyu on 2016/4/19.
 */
public class ShellSort {
    public static void main(String args[]) {
        int a[] = {14, 50, 72, 31, 52, 6, 8, 23, 94};
        ShellSort shellSort = new ShellSort();
        shellSort.ShellSort(a, a.length / 2);
        int length = a.length;
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /*   public void ShellSort(int[] a,int k){
           while (k>0) {
               for (int i = 0; i + k < a.length; i++) {
                   if (a[i] > a[i + k]) {
                       int temp = a[i];
                       a[i] = a[i + k];
                       a[i + k] = temp;
                   }
               }
               k = k / 2;
           }
       }*/
    public void ShellSort(int[] a, int k) {
        while (k > 0) {
            for (int i = k; i < a.length; i++) {
                int key=a[i];
                int j=i-k;
                while (key<a[j]){
                    a[j+k]=a[j];
                    j-=k;
                    if(j<0)
                        break;
                }
                a[j+k]=key;
            }
            k = k / 2;
        }
    }
}
