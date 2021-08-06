import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int include = 0, exclude = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (i == 0) {
        include = arr[i];
        continue;
      }

      int  prevE = exclude;
      
      exclude = Math.max(include, exclude);
      include = arr[i] + prevE;
    }

    System.out.println(Math.max(include, exclude));

  }
}