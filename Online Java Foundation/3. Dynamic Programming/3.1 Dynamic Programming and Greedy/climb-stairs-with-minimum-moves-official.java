import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(climbStairsWithMinMoves(a, n));
    }

    public static int climbStairsWithMinMoves(int path[], int n) {
        Integer dp[] = new Integer[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (path[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= path[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        return dp[0];
    }
}