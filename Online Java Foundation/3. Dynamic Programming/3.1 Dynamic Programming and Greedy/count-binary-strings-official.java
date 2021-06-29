import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int p0,p1,c0 = 1,c1 = 1;
    
     for(int i = 2; i<=n; i++){
         p0 = c0;
         p1 = c1;
                 
        c0 = p1;
        c1 = p0 + p1;
            
     }
     
    System.out.println(c0 + c1);
    
    // int[][] dp = new int[n+1][2];
    
    
    // for(int i = 0; i<= n; i++){
    //     for(int j = 0; j<2; j++){
    //         if(i == 0 || i == 1){
    //             dp[i][j] = i;
    //         } else if (j == 0) {
    //              dp[i][j] = dp[i-1][1];
    //         } else {
    //              dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
    //         }
    //     }
    // }
    
    // System.out.println(dp[n][0] + dp[n][1]);
  }

}