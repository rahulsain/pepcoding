import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
         int s = sc.nextInt();
         int r = sc.nextInt();
         
         rotateShell(arr, s, r);
         display(arr);
   }

   public static void rotateShell(int[][] arr, int s, int r) {
      int[] oneD = fillOneD(arr, s);
      rotate(oneD, r);
      fill2d(arr, oneD, s);
   }

   public static int[] fillOneD(int[][] arr, int s) {
      int minr = s - 1;
      int minc = s - 1;
      int maxr = arr.length - s;
      int maxc = arr[0].length - s;
      // calculate size of new oneD array (watch video - 18:38)
      int sz = 2 * (maxr - minr + maxc - minc);
      int[] oneD = new int[sz];
      
      // left wall
      int idx = 0;
      for (int i = minr; i <= maxr; i++) {
         oneD[idx] = arr[i][minc];
         idx++;
      }

      // bottom wall
      for (int j = minc + 1; j <= maxc; j++) {
         oneD[idx] = arr[maxr][j];
         idx++;
      }

      // right wall
      for (int i = maxr - 1; i >= minr; i--) {
         oneD[idx] = arr[i][maxc];
         idx++;
      }

      // top wall
      for (int j = maxc - 1; j >= minc + 1; j--) {
         oneD[idx] = arr[minr][j];
         idx++;
      }

      return oneD;
   }

   public static void fill2d(int[][] arr, int[] oneD, int s) {
      int minr = s - 1;
      int minc = s - 1;
      int maxr = arr.length - s;
      int maxc = arr[0].length - s;

      // left wall
      int idx = 0;
      for (int i = minr; i <= maxr; i++) {
         arr[i][minc] = oneD[idx];
         idx++;
      }

      // bottom wall
      for (int j = minc + 1; j <= maxc; j++) {
         arr[maxr][j] = oneD[idx];
         idx++;
      }

      // right wall
      for (int i = maxr - 1; i >= minr; i--) {
         arr[i][maxc] = oneD[idx];
         idx++;
      }

      // top wall
      for (int j = maxc - 1; j >= minc + 1; j--) {
         arr[minr][j] = oneD[idx];
         idx++;
      }
   }

   public static void rotate(int[] oneD, int r) {
      r = r % oneD.length;
      if (r < 0) {
         r += oneD.length;
      }

      reverse(oneD, 0, oneD.length - 1 - r);
      reverse(oneD, oneD.length - r, oneD.length - 1);
      reverse(oneD, 0, oneD.length - 1);
   }

   public static void reverse(int[] arr, int i1, int i2) {
      int li = i1;
      int ri = i2;
      while (li < ri) {
         int temp = arr[li];
         arr[li] = arr[ri];
         arr[ri] = temp;

         li++;
         ri--;
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