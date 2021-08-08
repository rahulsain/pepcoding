import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int dp[][] = new int[n][k];
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                if (i == 0) {
                    dp[i][j] = a[i][j];
                    if (a[i][j] <= nleast) {
                        nsleast = nleast;
                        nleast = a[i][j];

                    } else if (a[i][j] <= nsleast) {
                        nsleast = a[i][j];
                    }
                } else {
                    if (least == dp[i - 1][j]) {
                        dp[i][j] = a[i][j] + sleast;
                    } else {
                        dp[i][j] = a[i][j] + least;
                    }

                    if (dp[i][j] <= nleast) {
                        nsleast = nleast;
                        nleast = dp[i][j];

                    } else if (dp[i][j] <= nsleast) {
                        nsleast = dp[i][j];
                    }

                }

            }
            least = nleast;
            sleast = nsleast;
        }

        System.out.println(least);

    }
}