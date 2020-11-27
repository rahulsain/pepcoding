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
        int rcur = 0;
        int ccur = 0;
        int dir = 0;

        while (true) {
            dir = (dir + a[rcur][ccur]) % 4;

            if (dir == 0) {
                ccur++;
            } else if (dir == 1) {
                rcur++;
            } else if (dir == 2) {
                ccur--;
            } else {
                rcur--;
            }

            if (ccur < 0) {
                ccur++;
                break;
            } else if (rcur < 0) {
                rcur++;
                break;
            } else if (ccur > m-1) {
                ccur--;
                break;
            } else if (rcur > n-1) {
                rcur--;
                break;
            }
        }
        System.out.println(rcur + "\n" + ccur);
    }

}