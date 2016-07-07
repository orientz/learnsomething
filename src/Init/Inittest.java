package Init;

import java.util.Random;

/**
 * Created by wb-cengyanyu on 2016/5/11.
 */

//���Գ�ʼ��
public class Inittest {
    public static Random random = new Random(47);

    public static void main(String[] args) {
        Class c1 = Initable1.class;//�����ʼ��
        System.out.println(Initable1.staticFinal01);//�����ڳ���
        System.out.println(Initable1.staticFinal02);//ǿ����ĳ�ʼ�����Ǳ����ڳ���
        System.out.println("-----------------------------------1");
        try {
            Class c2 = Class.forName("Initable1");//ֱ�Ӿͳ�ʼ����
            System.out.println(Initable2.staticFinal01);
            System.out.println(Initable2.staticFinal02);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------2");

        Class c3 = Initable3.class;
        System.out.println(Initable3.staticFinal01);//�Ǳ����ڳ���
        System.out.println(Initable3.staticFinal02);
        System.out.println("-----------------------------------3");
        new Initable2();
        System.out.println(Initable2.staticFinal01);
        System.out.println(Initable2.staticFinal02);
    }
}

class Initable1 {
    static final int staticFinal01 = 47;
    static final int staticFinal02 = Inittest.random.nextInt(1000);

    static {
        System.out.println("Initable1 static");
    }

    public Initable1() {
        System.out.println("Initable1 Constructor");
    }
}

class Initable2 {
    static final int staticFinal02 = Inittest.random.nextInt(1000);
    static int staticFinal01 = 12;

    static {
        System.out.println("Initable2 static");
    }

    public Initable2() {
        System.out.println("Initable2 Constructor");
    }
}

class Initable3 {
    static final int staticFinal02 = Inittest.random.nextInt(1000);
    static int staticFinal01 = 12;

    static {
        System.out.println("Initable3 static");
    }

    public Initable3() {
        System.out.println("Initable3 Constructor");
    }
}

