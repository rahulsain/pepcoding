import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(a,i,j,j,i);
            }
        }
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                swap(a,i,l,i,r);
                l++;
                r--;
            }
        }
        display(a);
    }

    public static void swap(int[][] ar,int a, int b,int c,int d) {
        int temp = ar[a][b];
        ar[a][b] = ar[c][d];
        ar[c][d] = temp;
    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}