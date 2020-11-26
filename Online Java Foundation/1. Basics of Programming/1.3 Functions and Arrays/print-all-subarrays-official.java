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
        // printSubArrays(a, 0, 0);
        
        for (int i=0; i <n; i++) 
        { 
            // Pick ending point 
            for (int j=i; j<n; j++) 
            { 
                // Print subarray between current starting 
                // and ending points 
                for (int k=i; k<=j; k++) 
                    System.out.print(a[k]+"\t"); 
                System.out.println();
            } 
        } 
    
    
    }

    public static void printSubArrays(int[] a, int s, int e) {
        if (e == a.length) {
            return;
        } else if (s > e) {
            printSubArrays(a, 0, e + 1);
        } else {
            for (int i = s; i <= e; i++) {
                System.out.print(a[i] + "\t");
            }
            System.out.println();
            printSubArrays(a, s + 1, e);
        }
        return;
    }
}