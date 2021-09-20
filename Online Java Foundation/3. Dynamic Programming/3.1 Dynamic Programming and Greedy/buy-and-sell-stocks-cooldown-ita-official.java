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
    
 
    int s = 0, b = -a[0],c = 0;


    for (int i = 1; i < n; i++) {
        int ns = 0;
        int nb = 0;
        int nc = 0;
        
        
      nb = Math.max(c - a[i],b);
      ns = Math.max(b + a[i] ,s);
      nc = Math.max(s ,c);
      
      s = ns;
      b = nb;
      c = nc;
    }

    System.out.println(s);
  }

}