import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList < String > getStairPaths(int n) {
        if (n == 0) {
            ArrayList < String > blank = new ArrayList < String > ();
            blank.add("");
            return blank;
        }else if(n < 0){
            return new ArrayList<>();
        }
        ArrayList < String > p1 = getStairPaths(n - 1);
        ArrayList < String > p2 = getStairPaths(n - 2);
        ArrayList < String > p3 = getStairPaths(n - 3);
        ArrayList < String > ans = new ArrayList < > ();
        for (String t1: p1) {
            ans.add(1+ t1);
        }
        for (String t2: p2) {
            ans.add(2 + t2);
        }
        for (String t3: p3) {
            ans.add(3 + t3);
        }
        return ans;
    }

}