import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutations(s);
    }

    public static void printPermutations(String str,String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }  
        char ch = str.charAt(0);
        String ros = str.substring(1);
        for(int i = 0; i<str.length(); i++){
            
        }
    }

}