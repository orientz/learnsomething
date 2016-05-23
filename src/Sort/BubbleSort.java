package Sort;

/**
 * Created by wb-cengyanyu on 2016/4/19.
 */
public class BubbleSort extends Sort {
    public void BubbleSort(int[] a){
        int i=a.length-1;
        int pos=i;
        int temp;
        while(i>0){
            pos=0;
            for(int j=0;j<i;j++){
                if(a[j+1]<a[j]){
                    pos=j;
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        i=pos;
        }
    }
    public static void main(String args[]){
        BubbleSort bubbleSort=new BubbleSort();
      //  bubbleSort.BubbleSort(bubbleSort.a);
        bubbleSort.selectsort.SelectSort(bubbleSort.a);
        bubbleSort.prt(bubbleSort.a);
        Sort sort=new Sort();
        sort.prt(sort.a);
    }
}
