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
    
    int fee= sc.nextInt();
 
    int s = 0, b = -a[0];


    for (int i = 1; i < n; i++) {
        int ns = 0;
        int nb = 0;
        
        
      nb = Math.max(s - a[i],b);
      ns = Math.max(b + a[i] - fee ,s);
      
      s = ns;
      b = nb;
    }

    System.out.println(s);
  }

}