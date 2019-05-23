package Thread.ThreadTest;

/**
 * Created by wb-cengyanyu on 2016/4/15.
 */
public class Threadtest2  implements Runnable{
    private Foo foo =new Foo();
    static void hh(){
        System.out.println("hh");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Threadtest2(String name){
        setName(name);
    }
    public void run(){
       /* for(int i=0;i<5;i++){
            for(long h=0;h<1000000000;h++);
            System.out.println(this.name+":"+i);
        }*/
        for (int i = 0; i < 3; i++){
            this.fix(30);
            System.out.println(Thread.currentThread().getName()+":::"+foo.getA());
        }

    }
    public int fix(int y) {
        return foo.fix(y);
    }
    public static void main(String a[]){
        Threadtest2 t1=new Threadtest2("t1");
       // Threadtest2 t2=new Threadtest2("t2");
        Thread tt1=new Thread(t1,"t1");
        Thread tt2=new Thread(t1,"t2");
        tt1.start();
        tt2.start();


    }


}
