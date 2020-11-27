import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int i =0;
        for (int j = 0; j < m; j++) {
            if((j+1) % 2 == 0){
                    i = n-1;
                }
                else{
                    i = 0;
                }
            
            while (i < n && i > -1) {
                System.out.println(a[i][j]);
                if((j+1) % 2 == 0){
                    i--;
                }
                else{
                    i++;
                }
            }
        }
    }

}