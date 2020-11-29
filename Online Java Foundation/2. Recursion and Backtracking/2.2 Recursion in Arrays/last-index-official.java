import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(a, n-1, x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if (idx == -1)
            return -1;

        if (x == arr[idx]) {
            return idx;
        }
        int f = lastIndex(arr, idx - 1, x);
        return f;
    }

}