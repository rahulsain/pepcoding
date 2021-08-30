import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int same = k;
        int diff = k * (k-1);
        
        for(int i = 3; i<=n; i++){
            int psame = same;
            int pdiff = diff;
            
            same = pdiff;
            diff = (pdiff + psame) * (k - 1);
        }
        
        System.out.println(same + diff);
    }
}