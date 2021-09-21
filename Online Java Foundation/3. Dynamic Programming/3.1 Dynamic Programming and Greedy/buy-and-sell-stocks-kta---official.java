import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    int k = sc.nextInt();
    
    int[][] dp = new int[k+1][n];
    
    for(int t = 1; t<= k; t++){ 
        int max = Integer.MIN_VALUE;
        for(int d = 1; d < n; d++){
            max = Math.max(dp[t-1][d-1] - a[d - 1],max);
            dp[t][d] = Math.max(dp[t][d-1],max + a[d]);
        }
    }

    System.out.println(dp[k][n-1]);
  }

}