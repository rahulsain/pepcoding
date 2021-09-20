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
    
 
   int lsr = a[0], pl = 0, max = Integer.MIN_VALUE;
    int dpol[] = new int[n];
    
       int msr = a[n-1], pm = 0;
    int dpom[] = new int[n];

    for (int i = 1; i < n; i++) {
      lsr = Math.min(lsr,a[i]);
      pl = a[i] - lsr;
      
      dpol[i] = Math.max(dpol[i-1],pl);

    }
    
    for (int i = n-2; i > -1; i--) {
      msr = Math.max(msr,a[i]);
      pm = msr - a[i];
      
      dpom[i] = Math.max(dpom[i+1],pm);

    }
    
    for (int i = 0; i < n; i++) {
      max = Math.max(max,dpom[i]+dpol[i]);
    }

    System.out.println(max);
  }

}