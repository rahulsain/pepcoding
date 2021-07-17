import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        countEncodings(s);
    }

    public static void countEncodings(String str) {
        int dp[] = new int[str.length()];
        dp[0] = 1;

        for (int i = 1; i < str.length(); i++) {
            char chcode = str.charAt(i);
            char pchcode = str.charAt(i - 1);
            int chval = Integer.parseInt(str.substring(i - 1, i + 1));

            if (chcode == '0' && pchcode == '0') {
                dp[i] = 0;
            } else if (chcode == '0' && pchcode != '0') {
                if (chval <= 26) {
                    dp[i] = i > 1 ? dp[i - 2] : 1;
                } else {
                    dp[i] = 0;
                }
            } else if (pchcode == '0' && chcode != '0') {
                dp[i] = dp[i - 1];
            } else {
                if (chval <= 26) {
                    dp[i] = i > 1 ? dp[i - 2] : 1;
                } else {
                    dp[i] = 0;
                }
                dp[i] += dp[i - 1];
            }
        }

        System.out.println(dp[str.length() - 1]);
    }

}