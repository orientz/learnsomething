package InteractionTest;

import java.security.PublicKey;

/**
 * Created by wb-cengyanyu on 2016/4/18.
 */
public class PersonImpl implements Person{

    @Override
    public void showname(String name) {
        System.out.println(name);
    }
    public void aaa(){
        System.out.println("rss");
    }
    public static void main(String args[]){
      Person person = new PersonImpl();
        person.showname("ddd");
        System.out.println(person.a);
        PersonImpl person1=new PersonImpl();
        person1.aaa();
    }
}
