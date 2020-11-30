import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int a[][] = new int[n][m];
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr  && sc == dc ) {
            ArrayList < String > blank = new ArrayList < > ();
            blank.add("");
            return blank;
        }else if(sr == dr + 1 || sc == dc +1){
            return new ArrayList<String>();
        }


        ArrayList < String > v = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList < String > h = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList < String > ans = new ArrayList < > ();
        for (String tem: h) {
            ans.add("h" + tem);
        }
        for (String tem: v) {
            ans.add("v" + tem);
        }
        

        return ans;
    }

}