import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                int l = ss.length() - 1;
                boolean flag = true;
                for (int k = 0; k <= ss.length() / 2; k++) {
                    if (ss.charAt(k) != ss.charAt(l--)){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    System.out.println(ss);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}