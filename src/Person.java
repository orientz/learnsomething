/**
 * Created by wb-cengyanyu on 2016/4/11.
 */
public class Person {
    public static void prt(String s) {
        System.out.println(s);
        }
    Person() {
        prt("A Person.");
    }
    Person(String name) {
        prt("A person name is:" + name);
    }

    public void show(){
        prt("zyyfather");
    }
}
