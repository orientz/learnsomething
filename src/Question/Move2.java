package Question;

import java.util.Scanner;

/**
 * Created by wb-cengyanyu on 2016/6/1.
 */
public class Move2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.next();
            int num=0;
            for (int i = 0; i <str.length() ; i++) {
                String temp= String.valueOf(str.charAt(i));

                if(temp==temp.toUpperCase()){
                    num++;
                }else{
                    String t= String.valueOf(str.charAt(i));
                    for (int j = 0; j <num ; j++) {
                        t+=str.charAt(i-num+j);
                    }
                    str=str.substring(0,i-num)+t+str.substring(i+1);
                }
            }
            System.out.println(str);
        }
        scanner.close();
    }
}
