import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        displayArrReverse(a,0);
    }

    public static void displayArrReverse(int[] a, int idk) {
        if(idk == a.length){
            return;
        }
        displayArrReverse(a,idk+1);
        System.out.println(a[idk]);
    }

}