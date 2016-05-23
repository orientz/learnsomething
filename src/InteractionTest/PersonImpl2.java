package InteractionTest;

/**
 * Created by wb-cengyanyu on 2016/4/18.
 */
public class PersonImpl2 implements Person {
    @Override
    public void showname(String name) {
        System.out.println(name);
    }
    public static void main(String args[]){
        Person person = new PersonImpl();
        person.showname("ddd");
        System.out.println(person.a);
        PersonImpl person1=new PersonImpl();
        person1.aaa();
    }
}
