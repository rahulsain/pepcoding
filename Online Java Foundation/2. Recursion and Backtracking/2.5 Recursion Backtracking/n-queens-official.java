import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        printNQueens(a, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row >= chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        for (int c = 0; c < chess.length; c++) {
            if (chess[row][c] == 0 && isSafe(chess, row, c) == true) {
                chess[row][c] = 1;
                printNQueens(chess, qsf + row + "-" + c + ", ", row + 1);
                chess[row][c] = 0; //backtracking
            }
        }
    }

    public static boolean isSafe(int a[][], int r, int c) {
        int i = r - 1;
        int j = c - 1;
        while (i >= 0 && j >= 0) {
            if (a[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }
        for (i = r - 1, j = c; i >= 0; i--) {
            if (a[i][j] == 1) {
                return false;
            }
        }
        i = r - 1;
        j = c + 1;
        while (i >= 0 && j < a.length) {
            if (a[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}