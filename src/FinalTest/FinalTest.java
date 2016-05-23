package FinalTest;

/**
 * Created by wb-cengyanyu on 2016/5/17.
 */
public class FinalTest {
    public static void main(String[] args) {
        Car car=new Car("1");
        change(car);
        System.out.printf(car.wheel);
        int i=1;
        changei(i);
        System.out.println(i);

    }
    private static void change( Car car){
        car.setWheel("2");
        car=new Car("3");
    }
    private static void changei(final int i){
      //  i=2;
    }


}
class Car{
    public String wheel;
    public Car(String w){
        this.wheel=w;
    }
    public void setWheel(String w){
        this.wheel=w;
    }
}
