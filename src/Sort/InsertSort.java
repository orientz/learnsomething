package Sort;

/**
 * Created by wb-cengyanyu on 2016/4/18.
 */
public class InsertSort {
   /* public void InsertSort(int[] a){
        int length=a.length;
        int[] result=new int[length];
        for(int i=0;i<length-1;i++){
            if(a[i]>a[i+1]){
                int key=i+1;
                while (a[key]<a[key-1]){
                    int temp=a[key-1];
                    a[key-1]=a[key];
                    a[key]=temp;
                    key--;
                    if(key==0)
                        break;
                }
            }
        }
    }*/
    public void InsertSort(int[] a){
        int length=a.length;
        for(int i=1;i<length;i++){
            int key=i;
            int temp=a[key];
            key=key-1;
            while(temp<a[key]){
                a[key+1]=a[key];
                key--;
                if(key<0)
                    break;
            }
            a[key+1]=temp;
        }
    }

    public static void main(String args[]){
        int a[]={14,50,72,31,52,6,8,23,94};
        InsertSort insertSort=new InsertSort();
        insertSort.InsertSort(a);
        int length=a.length;
        for(int i=0;i<length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
