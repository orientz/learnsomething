package Thread.ThreadLocal;

import java.util.Random;

public class ThreadLocalTest implements Runnable {
    ThreadLocal<Person> threadLocal = new ThreadLocal<Person>();

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        Person person = getPerson(); //ͨ�����������Ϊÿ���̶߳�������newһ��student����ÿ���̵߳ĵ�student���󶼿������ò�ͬ��ֵ
        Random random = new Random();
        int age = random.nextInt(100);
        person.setName(""+age);
        System.out.println(threadName +"��һ��"+age);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName+"�ڶ���"+age);
    }

    public static void main(String[] args) {
        ThreadLocalTest t = new ThreadLocalTest();
        Thread t1 = new Thread(t,"1111");
        Thread t2 = new Thread(t,"2222");
        t1.start();
        t2.start();
    }

    private Person getPerson() {
        Person studen = threadLocal.get();
        if (null == studen) {
            studen = new Person();
            threadLocal.set(studen);
        }
        return studen;
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
