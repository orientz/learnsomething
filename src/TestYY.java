/**
 * Created by wb-cengyanyu on 2016/4/12.
 */
public class TestYY {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public static String a1=new String("123");
    public static String b1=new String("123");
    public static String a2="123";
    public static String b2="123";

    public static void main(String[] args) {
        System.out.println(a1==b1);
        System.out.println(a2==b2);
        System.out.println(a1.equals(b1));
        int num=0;
        for(int i=1000;i<=1999;i++){
            String s=String.valueOf(i);
            char a[]=s.toCharArray();
            int flag=0;
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(a[j]==a[k]){
                       flag++;
                    }
                }
            }
            if(flag==6)
                num++;
        }
        System.out.println(num);
        String a="S";
        System.out.println(a.toLowerCase());

        int r=1;
        for(int i=54;i>=27;i--){
            r=r*i;
        }
       // System.out.println(r);

    }
}
