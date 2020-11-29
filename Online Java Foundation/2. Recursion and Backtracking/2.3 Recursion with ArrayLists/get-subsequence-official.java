import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(gss(s));
    }

    public static ArrayList < String > gss(String str) {
        if (str.length() == 0) {
            ArrayList < String > blank = new ArrayList < String > ();
            blank.add("");
            return blank;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList < String > list = gss(ros);
        ArrayList < String > ans = new ArrayList<>();
        for (String tem: list) {
            ans.add("" + tem);
        }
        for (String tem: list) {
            ans.add(ch + tem);
        }
        return ans;
    }

}