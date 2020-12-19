import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int move[] = new int[n];
        for (int i = 0; i < n; i++) {
            move[i] = sc.nextInt();
        }
        System.out.println(countPathsTab(n, move));
    }

    public static int countPathsTab(int n, int[] path) {
        int dp[] = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= path[i] && i + j < dp.length; j++) {
                dp[i] += dp[i + j];
            }
        }
        return dp[0];
    }
}