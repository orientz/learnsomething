import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wb-cengyanyu on 2016/4/11.
 */
public class Chinese extends Person {
    Chinese() {
        //super(); // ���ø��๹�캯����1��
        prt("a Chinese");
    }
    Chinese(String name){
        super(name);
        prt("his name is:" + name);
    }
    Chinese(String name,int age){
        this(name);
        prt("age is "+age);
    }
    public void show(String a){
        prt("zyyson");
        super.show();
    }
    public static void main(String[] args){
        Person person=new Chinese();

      /*  Chinese zyy=new Chinese("zyy",3);
        try {
            //�õ������
            Class c = Class.forName("Chinese");
            Object yourObj = c.newInstance();
            //�õ�����
            Class clazz = zyy.getClass();
            Method methlist[] = clazz.getDeclaredMethods();
            for (int i = 0; i < methlist.length; i++) {
                Method m = methlist[i];
                System.out.println(m.getName());
            }
            //��ȡ����������,���跽���Ĳ�����һ��int,method��ΪsetAge
            Method sAge = c.getMethod("setAge", new Class[] {int.class});
            //��ò���Object
            Object[] arguments = new Object[] { new Integer(37)};
            //ִ�з���
            sAge.invoke(yourObj , arguments);
        } catch (Exception e) {
        }*/
      /*  Chinese zyy=new Chinese("zyy",3);
        zyy.show();
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
        Thread.currentThread().getStackTrace()[0].getMethodName();

        Class clazz = zyy.getClass();
        Field[] fields = zyy.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }*/

       TestYY t1=new TestYY();
        t1.setA(1);
        TestYY t2=t1;
        t2.setA(2);
        System.out.print(t1.getA());
    }
}
