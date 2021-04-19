import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        int w[] = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int cap = sc.nextInt();

        int dp[] = new int[cap + 1];
        dp[0] = 0;

        for (int i = 1; i < cap + 1; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {

                if (w[j] <= i) {
                    int val = dp[i - w[j]] + v[j];
                    max = Math.max(max, val);
                }
            }
            dp[i] = max;
        }
        System.out.println(dp[cap]);
    }
}