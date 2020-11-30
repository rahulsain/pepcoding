import java.io.*;
import java.util.*;

public class Main {
    
    static String keypadArr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getKPC(s));
    }

    public static ArrayList < String > getKPC(String str) {
        if (str.length() == 0) {
            ArrayList < String > blank = new ArrayList < String > ();
            blank.add("");
            return blank;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList < String > list = getKPC(ros);
        ArrayList < String > ans = new ArrayList < > ();
        String code = keypadArr[ch-'0'];
        for (int i =0; i<code.length(); i++) {
            char chcode = code.charAt(i);
            for(String tem: list){
                ans.add(chcode+tem);
            }
        }
        return ans;
    }

}