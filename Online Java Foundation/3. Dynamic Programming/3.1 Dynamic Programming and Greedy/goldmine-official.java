import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
        }

        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;
        for (int j = m - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                if (i == 0 && j != m - 1) {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + arr[i][j];
                } else if (i == n - 1 && j != m - 1) {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i - 1][j + 1]) + arr[i][j];
                } else if (j == m - 1) {
                    dp[i][j] = arr[i][j];
                } else if (j == 0) {
                    dp[i][j] = arr[i][j] + Math.max(Math.max(dp[i][j + 1], dp[i + 1][j + 1]), dp[i - 1][j + 1]);
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = arr[i][j] + Math.max(Math.max(dp[i][j + 1], dp[i + 1][j + 1]), dp[i - 1][j + 1]);
                }
            }
        }
        System.out.println(max);
    }
}