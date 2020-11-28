import java.io.*;
import java.util.*;

public class Main {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            char prv = s.charAt(i - 1);
            int gap = cur - prv;
            sb.append(gap);
            sb.append(cur);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}