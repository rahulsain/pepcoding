import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPathsTab(n));
    }

    public static int countPaths(int n, int i, int qb[]) {
        if (i == n) {
            return 1;
        } else if (i > n) {
            return 0;
        } else if (qb[i] > 0) {
            return qb[i];
        }
        qb[i] = countPaths(n, i + 1, qb) + countPaths(n, i + 2, qb) + countPaths(n, i + 3, qb);
        return qb[i];
    }

    public static int countPathsTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}