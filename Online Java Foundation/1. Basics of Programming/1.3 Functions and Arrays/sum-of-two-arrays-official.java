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
        int max = Math.max(n1, n2);
        int[] a = new int[max];
        int c = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        for (int k = max - 1; k >= 0; k--) {
            if (i > -1 && j > -1) {
                a[k] = (a1[i] + a2[j] + c) % 10;
                c = (a1[i--] + a2[j--] + c) / 10;
            }
            else if(i > -1){
                a[k] = (a1[i]  + c) % 10;
                c = (a1[i--] + c) / 10;
            }
            else if(j > -1){
                a[k] = (a2[j]  + c) % 10;
                c = (a2[j--] + c) / 10;    
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}