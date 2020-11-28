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
        int s = sc.nextInt();
        int r = sc.nextInt();
        shellRotate(a, s, r);
        display(a);
    }

    public static void shellRotate(int[][] a, int s, int r) {
        int[] oned = shellToOneD(a, s);
        rotate(oned, r);
        oneDToShell(a, s, oned);
    }

    public static int[] shellToOneD(int[][] a, int s) {
        int cmin = s - 1;
        int rmin = s - 1;
        int cmax = a[0].length - 1;
        int rmax = a.length - 1;
        int size = 2 * (cmax - cmin + rmax - rmin);
        int oned[] = new int[size];

        int i = 0;
        int rcur = rmin;
        int ccur = cmin;

        while (rcur <= rmax) {
            oned[i++] = a[rcur++][cmin];
        }
        ccur++;
        rcur--;
        while (ccur <= cmax) {
            oned[i++] = a[rmax][ccur++];
        }
        rcur--;
        ccur--;
        while (rcur >= rmin) {
            oned[i++] = a[rcur--][cmax];
        }
        ccur--;
        rcur++;
        while (ccur >= cmin + 1) {
            oned[i++] = a[rmin][ccur--];
        }
        return oned;
    }

    public static void oneDToShell(int[][] a, int s, int[] oned) {
        int cmin = s - 1;
        int rmin = s - 1;
        int cmax = a[0].length - 1;
        int rmax = a.length - 1;

        int i = 0;
        int rcur = rmin;
        int ccur = cmin;

        while (rcur <= rmax) {
            a[rcur++][cmin] = oned[i++];
        }
        ccur++;
        rcur--;
        while (ccur <= cmax) {
            a[rmax][ccur++] = oned[i++];
        }
        rcur--;
        ccur--;
        while (rcur >= rmin) {
            a[rcur--][cmax] = oned[i++];
        }
        ccur--;
        rcur++;
        while (ccur >= cmin + 1) {
            a[rmin][ccur--] = oned[i++];
        }
    }

    public static void rotate(int[] a, int k) {
        k %= a.length;
        if (k < 0) {
            k += a.length;
        }
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    public static void reverse(int[] a, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
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