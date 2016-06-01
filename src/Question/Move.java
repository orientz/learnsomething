package Question;

import java.util.Scanner;

/**
 * Created by wb-cengyanyu on 2016/6/1.
 */
public class Move {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.next();
            String Up="";
            String low="";
            for (int i = 0; i <str.length() ; i++) {
                String temp= String.valueOf(str.charAt(i));
                if(temp==temp.toUpperCase()){
                    Up+=temp;
                }else {
                    low+=temp;
                }
            }
            String result=low+Up;
            System.out.println(result);
        }
        scanner.close();
    }
}
