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
        System.out.println(maxOfArray(a,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(arr.length == idx)
            return 0;
        int temp = maxOfArray(arr,idx+1);
        if(arr[idx] > temp){
            return arr[idx];
        }
        return temp;
    }

}