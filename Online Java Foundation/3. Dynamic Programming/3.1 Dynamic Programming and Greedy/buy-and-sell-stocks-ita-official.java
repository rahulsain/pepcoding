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

    int s = a[0], b = a[0], max = 0;


    for (int i = 1; i < n; i++) {
      if (a[i] > s && a[i] > b) {
        s = a[i];
      } else if (s > a[i]) {
        max += s - b;
        b = s = a[i];

      }
    }
    max += s - b;
    System.out.println(max);
  }

}