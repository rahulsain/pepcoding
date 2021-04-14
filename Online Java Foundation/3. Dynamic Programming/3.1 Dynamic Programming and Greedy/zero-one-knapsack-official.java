import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line , strs[];
        int n = Integer.parseInt(br.readLine());
        int v[] = new int[n];
        int w[] = new int[n];
        line = br.readLine(); // to read multiple integers line
        strs = line.trim().split(" ");
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(strs[i]);
        }
        line = br.readLine(); // to read multiple integers line
        strs = line.trim().split(" ");
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(strs[i]);
        }
        int cap = Integer.parseInt(br.readLine());
        
        int dp[][] = new int[n+1][cap+1];
        
        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<cap+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else{
                   int val = w[i-1];
                   if(val > j){
                        dp[i][j] = dp[i-1][j];
                   }
                   else{
                        dp[i][j] = Math.max(dp[i - 1][j - val] + v[i-1],dp[i - 1][j]);
                   }
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}