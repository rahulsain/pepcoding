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

    int lsr = a[0], p = a[0], max = Integer.MIN_VALUE;


    for (int i = 0; i < n; i++) {
      lsr = Math.min(lsr,a[i]);
      p = a[i] - lsr;
      
      max = Math.max(max,p);

    }

    System.out.println(max);

    // int s = a[0], b = a[0], max = Integer.MIN_VALUE;


    // for (int i = 1; i < n; i++) {
    //   int cs = s, cb = b;

    //   if (cb > a[i]) {
    //     cb = a[i];
    //     cs = a[i];
    //   } else if (cs < a[i]) {
    //     cs = a[i];
    //   }

    //   s = cs;
    //   b = cb;

    //   max = Math.max(s - b, max);

    // }

    // System.out.println(max);

  }

}