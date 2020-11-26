import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printSubSet(a, n);


    }

    public static void printSubSet(int[] a, int n) {
        int limit = (int)Math.pow(2,n);
        
        for(int i = 0; i<limit; i++){
            int temp = i;
            String ans = "";
            for(int j = n-1; j>=0; j--){
                int r = temp % 2;
                temp /= 2;
                
                if(r == 0){
                    ans = "-\t" + ans;
                }
                else{
                    ans = a[j] + "\t" + ans;
                }
            }
            System.out.println(ans);
        }
    }
}