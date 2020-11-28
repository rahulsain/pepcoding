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
        int i = 0;
        while (i < n) {
            int cpos = 0;
            for (int j = 1; j < n; j++) {
                if (a[i][cpos] > a[i][j]) {
                    cpos = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < n; k++) {
                if (a[k][cpos] > a[i][cpos]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(a[i][cpos]);
                return;
            }
            i++;
        }
        System.out.println("Invalid input");

    }

}