package Map;

import java.util.*;

/**
 * Created by wb-cengyanyu on 2016/5/3.
 */
public class Maptest {
    public static void main(String[] args) {
        TreeMap<String,Integer> test= new TreeMap<String, Integer>();
        HashMap<String,List<String> >a=new HashMap<String, List<String>>();
        List<String> a1=new ArrayList<String>();
        a1.add("a1");
        List<String> a2=new ArrayList<String>();
        a2.add("a2");
        a.put("zyy",a1);
        a.put("zyy",a2);
        for (String map:a.keySet()) {
            System.out.println(map);
            System.out.println(a.get(map).get(0));
        }
        test.put("zyy",100);
        test.put("zyy",99);

        Hashtable<String ,List<String>> table=new Hashtable<String, List<String>>();
        table.put("zyy",a1);
        table.put("zyy",a2);
        for (String map:table.keySet()) {
            System.out.println(map);
            System.out.println(a.get(map).get(0));
        }


    }
}
