import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > blank = new ArrayList < > ();
            blank.add("");
            return blank;
        } else if (sr > dr || sc > dc) {
            return new ArrayList < String > ();
        }
        ArrayList < String > ans = new ArrayList < > ();
        for (int h = 1; h <= dc - sc; h++) {
            ArrayList < String > h1 = getMazePaths(sr, sc + h, dr, dc);
            for (String tem: h1) {
                ans.add("h" + h + tem);
            }
        }
        for (int v = 1; v <= dr - sr; v++) {
            ArrayList < String > v1 = getMazePaths(sr + v, sc, dr, dc);
            for (String tem: v1) {
                ans.add("v" + v + tem);
            }
        }
        for (int d = 1; d <= dr - sr; d++) {
            ArrayList < String > d1 = getMazePaths(sr + d, sc + d, dr, dc);
            for (String tem: d1) {
                ans.add("d" + d + tem);
            }
        }
        return ans;
    }
}