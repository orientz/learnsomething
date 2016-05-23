import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wb-cengyanyu on 2016/4/11.
 */
public class Chinese extends Person {
    Chinese() {
        //super(); // 调用父类构造函数（1）
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
            //得到类对象
            Class c = Class.forName("Chinese");
            Object yourObj = c.newInstance();
            //得到方法
            Class clazz = zyy.getClass();
            Method methlist[] = clazz.getDeclaredMethods();
            for (int i = 0; i < methlist.length; i++) {
                Method m = methlist[i];
                System.out.println(m.getName());
            }
            //获取到方法对象,假设方法的参数是一个int,method名为setAge
            Method sAge = c.getMethod("setAge", new Class[] {int.class});
            //获得参数Object
            Object[] arguments = new Object[] { new Integer(37)};
            //执行方法
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
