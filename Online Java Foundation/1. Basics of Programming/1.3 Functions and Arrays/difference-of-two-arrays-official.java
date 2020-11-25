import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = Integer.parseInt(br.readLine());
        }
        int n2 = Integer.parseInt(br.readLine());
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = Integer.parseInt(br.readLine());
        }
        int[] a = new int[n2];
        int c = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = j;

        while (k >= 0) {
            int d = c;
            int a1v = (i >= 0) ? a1[i] : 0;

                if (a2[j] + c >= a1v) {
                    d = a2[j] + c - a1v;
                    c = 0;
                } else {
                    d = a2[j] + c + 10 - a1v;
                    c = -1;
                }
            a[k] = d;

            i--;
            j--;
            k--;
        }
        int temp = 0;
        int idx = 0;
        while (idx < n2){
            if(a[idx] != 0){
                break;
            }
            idx++;
        }
        for (i = idx; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}