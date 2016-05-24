package Question;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by wb-cengyanyu on 2016/5/24.
 */
public class Scantest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.nextLine();
            str1 = str1.trim();
            //ÄæÐò
            StringBuffer sb1=new StringBuffer(str1);
            String str2=sb1.reverse().toString();
            System.out.println(str2);
            int length=str2.length();
            int num[][]=new int[length+1][length+1];
            for (int i = 0; i <length ; i++) {
                for (int j = 0; j <length ; j++) {
                    num[i][j]=0;
                }
            }
            for (int i = 0; i < length; i++) {
                for (int j = 0; j <length ; j++) {
                    if(str1.charAt(i)==str2.charAt(j)){
                        num[i+1][j+1]=num[i][j]+1;
                    }else {
                        num[i+1][j+1]=Math.max(num[i][j+1],num[i+1][j]);
                    }
                }
            }
            System.out.println(num[length][length]);

        }
    }
}
