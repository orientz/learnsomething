package Sort;

/**
 * Created by wb-cengyanyu on 2016/4/19.
 */
public class SelectSort {
    public int minselect(int[] a,int i){
        int k=i;
        int key=a[i];
        for(int j=i+1;j<a.length;j++){
            if(a[j]<key){
                k=j;
                key=a[j];
            }
        }
        return k;
    }
    public void  SelectSort(int[] a){
        for(int i=0;i<a.length;i++){
            int k=minselect(a,i);
            int temp=a[i];
            a[i]=a[k];
            a[k]=temp;
        }
    }
    public static void main(String args[]) {
        int a[] = {14, 50, 72, 31, 52, 6, 8, 23, 94};
        SelectSort selectSort=new SelectSort();
        selectSort.SelectSort(a);
        int length = a.length;
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
