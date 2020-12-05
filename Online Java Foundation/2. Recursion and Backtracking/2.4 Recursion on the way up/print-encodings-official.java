import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printEncodings(s, "");
    }

    public static void printEncodings(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        } else if (str.length() == 1) {
            char chcode = str.charAt(0);
            if (chcode == '0') {
                return;
            } else {
                int ch = chcode - '0';
                char code = (char)('a' + ch - 1);
                System.out.println(ans + code);
            }
        } else {
            char chcode = str.charAt(0);
            String ros = str.substring(1);

            if (chcode == '0') {
                return;
            } else {
                int ch = chcode - '0';
                char code = (char)(ch + 'a' - 1);
                printEncodings(ros, ans + code);
            }

            int chval = Integer.parseInt(str.substring(0, 2));
            String roq = str.substring(2);

            if (chval <= 26) {
                char code = (char)('a' + chval - 1);
                printEncodings(roq, ans + code);
            }
        }

    }

}