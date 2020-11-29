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
        displayArr(a,n);
    }

    public static void displayArr(int[] a, int idk){
        if(idk == 0){
            return;
        }
        displayArr(a,idk-1);
        System.out.println(a[idk-1]);
    }

}