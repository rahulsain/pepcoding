import java.io.*;
import java.util.*;

public class Main {
 static String keypadArr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printKPC(s,"");
    }

    public static void printKPC(String q,String a) {
        if(q.length() == 0){
            System.out.println(a);
            return;
        }
        char ch = q.charAt(0);
        String ros = q.substring(1);
        String code = keypadArr[ch-'0'];
        for (int i =0; i<code.length(); i++) {
            char chcode = code.charAt(i);
            printKPC(ros,a + chcode);
        }
    }

}