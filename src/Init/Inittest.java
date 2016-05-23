package Init;

import java.util.Random;

/**
 * Created by wb-cengyanyu on 2016/5/11.
 */
public class Inittest {
        public static Random random = new Random(47);
        public static void main(String[] args) {
            Class c1 = Initable1.class;//不会初始化
            System.out.println(Initable1.staticFinal01);//编译期常量
            System.out.println(Initable1.staticFinal02);//强制类的初始化，非编译期常量
            System.out.println("-----------------------------------");
            try {
                Class c2 = Class.forName("Initable1");//直接就初始化了
                System.out.println(Initable2.staticFinal01);
                System.out.println(Initable2.staticFinal02);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("-----------------------------------");

            Class c3 = Initable3.class;
            System.out.println(Initable3.staticFinal01);//非编译期常量
            System.out.println(Initable3.staticFinal02);
            System.out.println("-----------------------------------");
            new Initable2();
            System.out.println(Initable2.staticFinal01);
            System.out.println(Initable2.staticFinal02);
        }
    }

    class Initable1 {
        static final int staticFinal01 = 47;
        static final int staticFinal02 = Inittest.random.nextInt(1000);
        static {System.out.println("Initable1 static");}

        public Initable1() {
            System.out.println("Initable1 Constructor");
        }
    }

    class Initable2 {
        static int staticFinal01 = 12;
        static final int staticFinal02 = Inittest.random.nextInt(1000);
        static {System.out.println("Initable2 static");}

        public Initable2() {
            System.out.println("Initable2 Constructor");
        }
    }

    class Initable3 {
        static int staticFinal01 = 12;
        static final int staticFinal02 = Inittest.random.nextInt(1000);
        static {System.out.println("Initable3 static");}

        public Initable3() {
            System.out.println("Initable3 Constructor");
        }
    }

