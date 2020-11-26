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
        int key = sc.nextInt();
        
        int pos = binarySearch(a, 0,n, key);

        System.out.println(a[pos]+"\n"+a[pos-1]);
    }
    
    public static int binarySearch(int[] a, int low, int high, int k) {
        int mid = (low + high) / 2;
        while (low <= high) {
            if (a[mid] == k) {
                return mid;
            } else if (a[mid] > k) {
                return binarySearch(a, low, mid - 1, k);
            } else {
                return binarySearch(a, mid + 1, high, k);
            }
        }

        return low;
    }

}