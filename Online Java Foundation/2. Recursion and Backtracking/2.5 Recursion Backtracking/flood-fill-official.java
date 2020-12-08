import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int maze[][] = new int[r][c];
        boolean visited[][] = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                visited[i][j] = true;
            }
        }
        floodfill(maze, 0, 0, "", visited);
    }

    public static void floodfill(int[][] m, int r, int c, String a, boolean[][] v) {
        if (r == m.length - 1 && c == m[0].length - 1) {
            System.out.println(a);
            return;
        } else if (r >= m.length || c >= m[0].length || r < 0 || c < 0 || m[r][c] == 1 || v[r][c] == false) {
            return;
        }
            v[r][c] = false;
            floodfill(m, r - 1, c, a + "t", v);
            floodfill(m, r, c - 1, a + "l", v);
            floodfill(m, r + 1, c, a + "d", v);
            floodfill(m, r, c + 1, a + "r", v);
            v[r][c] = true;
    }
}