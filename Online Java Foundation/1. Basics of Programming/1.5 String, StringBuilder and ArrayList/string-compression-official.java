import java.io.*;
import java.util.*;

public class Main {

    public static String compression1(String s) {
        String sc = s.charAt(0) + "";
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr != prev) {
                sc += curr;
            }
        }
        return sc;
    }

    public static String compression2(String s) {
        String sc = s.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    sc += count;
                    count = 1;
                }
                sc += curr;
            }
        }
        if (count > 1) {
            sc += count;
            count = 1;
        }
        return sc;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}