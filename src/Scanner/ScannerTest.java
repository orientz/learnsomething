package Scanner;



import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by wb-cengyanyu on 2016/5/31.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //scanner.useDelimiter(",");
        Formatter f=new Formatter(System.out);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
            System.out.println("ddd");
            System.out.println(scanner.next());
            int a= Integer.parseInt(scanner.next());
            f.format("16½øÖÆ: %x\n",a);
        }
        scanner.close();
    }
}
