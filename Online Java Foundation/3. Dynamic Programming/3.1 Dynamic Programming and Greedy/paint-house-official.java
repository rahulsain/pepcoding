import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int r = a[0][0], b = a[0][1], g = a[0][2];

        for (int i = 1; i < n; i++) {
            int pr = r, pg = g, pb = b;

            r = Math.min(pg, pb) + a[i][0];
            g = Math.min(pr, pb) + a[i][2];
            b = Math.min(pg, pr) + a[i][1];
        }

        System.out.println(Math.min(Math.min(r, b), g));

    }
}