import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();
        int r = 0, c = n - 1;
        while (c >= 0 && r < n) {
            if (a[r][c] == key) {
                System.out.println(r + "\n" + c);
                return;
            }
            if (a[r][c] > key)
                c--;
            else
                r++;
        }
        System.out.println("Not Found");
    }

}