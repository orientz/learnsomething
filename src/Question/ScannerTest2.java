package Question;

import java.util.Scanner;

/**
 * Created by wb-cengyanyu on 2016/6/1.
 */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.next();
            str=str.substring(3,str.length());
            System.out.println(str);
        }
    }
}
