import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    int a[][] = new int[n][m];
    for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            a[i][j] = Integer.parseInt(br.readLine());
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
 }

}