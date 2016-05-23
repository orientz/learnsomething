package ThreadCount;

/**
 * Created by wb-cengyanyu on 2016/4/25.
 */
public class Mycount {
    private String oid;
    private float money;
    public Mycount(String oid,float money){
        this.oid=oid;
        this.money=money;
    }
    public void getCount(){
        System.out.println("’Àªß:"+oid);
        System.out.println("”‡∂Ó:"+money);
    }


}
