package Sort;

/**
 * Created by wb-cengyanyu on 2016/4/20.
 */
public class HeapSort extends Sort {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] a = heapSort.a;
        int length = a.length;
        int n=length;
        for (int j=0;j<length;j++){
            for (int i = length / 2 - 1; i >= 0; i--) {
                heapSort.HeapSort(a, i,n);
            }
            System.out.print(a[0]+" ");
            a[0]=a[n-1];
            n--;

        }




    }

    public void Heap(int[] a, int i) { //前提是下面的堆都是最小堆
        int length = a.length;
        int j = 2 * i + 1;//左孩子
        int temp = a[i];
        while (j < length) {
            if (a[j + 1] < a[j]) {
                j++;
            }
            if (a[j] < temp) {
                a[i] = a[j];
                i = j;
                j = 2 * i + 1;
            }else
                break;
        }
        a[i] = temp;
    }
    public void HeapSort(int[] a,int i,int length){
        int j = 2 * i + 1;//左孩子
        int temp = a[i];
        while (j < length) {
            if (a[j + 1] < a[j]) {
                j++;
            }
            if (a[j] < temp) {
                a[i] = a[j];
                i = j;
                j = 2 * i + 1;
            }else
                break;
        }
        a[i] = temp;
    }

}
