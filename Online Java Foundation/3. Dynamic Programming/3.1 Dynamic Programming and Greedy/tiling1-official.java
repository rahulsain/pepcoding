import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.println(tilways(n));
    
  }
  public static int tilways(int n){
     int dp[] = new int[n+1];
     
     for(int i = 1; i<= n; i++){
         if(i == 1 || i == 2){
             dp[i] = i;
             continue;
         }
         dp[i] = dp[i-1] + dp[i-2];
     }
     
     return dp[n];
  }
}