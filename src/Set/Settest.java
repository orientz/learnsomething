package Set;

import java.util.*;

/**
 * Created by wb-cengyanyu on 2016/5/23.
 */
public class Settest {
    public static void main(String[] args) {
        TreeSet<String> t1=new TreeSet<String>();
        t1.add("zyy");
        t1.add("ycy");
        System.out.println(t1);
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.addAll(t1);
        System.out.println(hashSet);
        HashMap hashMap=new HashMap();
        hashMap.put("name","zyy");
        System.out.println(hashMap);
        Enumeration myEnumeration;
        Iterator it=hashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
