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
        int rmin = 0;
        int cmin = 0;
        int rmax = n-1;
        int cmax = m-1;
        
        int rcur = 0;
        int ccur = 0;
        int tne = n*m;
        int c = 0;
        
        while(rcur <= rmax && ccur <= cmax){
            while(rcur < rmax && c < tne) {
                System.out.println(a[rcur][cmin]);
                rcur++;
                c++;
            }
            cmin++;
             while(ccur < cmax && c < tne) {
                System.out.println(a[rmax][ccur]);
                ccur++;
                c++;
            }
            rmax--;
             while(rcur > rmin && c < tne) {
                System.out.println(a[rcur][cmax]);
                rcur--;
                c++;
            }
            cmax--;
             while(ccur > cmin && c < tne) {
                System.out.println(a[rmin][ccur]);
                ccur--;
                c++;
            }
            rmin++;
        }
    }

}