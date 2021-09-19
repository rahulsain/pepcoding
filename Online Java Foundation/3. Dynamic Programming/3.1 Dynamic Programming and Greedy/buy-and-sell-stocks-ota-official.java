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

    int[] dp = new int[n];

    int s = a[0], b = a[0], max = Integer.MIN_VALUE;
    dp[0] = a[0];

    for (int i = 1; i < n; i++) {
      int cs = s, cb = b;

      if (cb > a[i]) {
        cb = a[i];
        cs = a[i];
      } else if (cs < a[i]) {
        cs = a[i];
      }

      s = cs;
      b = cb;

      max = Math.max(s - b, max);

    }

    System.out.println(max);

  }

}