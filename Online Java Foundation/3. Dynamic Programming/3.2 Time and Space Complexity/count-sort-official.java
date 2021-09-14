import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
    //write your code here

    int newarr[] = new int[max - min + 1];

    for (int i = 0; i < arr.length; i++) {
      newarr[arr[i] - min]++;
    }

    // int k = 0;
    // for (int  j = 0; j < newarr.length;  j++) {
    //     int val = j + min;
    //   for (int i = newarr[j]; i > 0 && k < arr.length; i--) {
    //       arr[k++] = val;
    //   }
    // }
    
    for (int i = 1; i < newarr.length; i++) {
      newarr[i] += newarr[i-1];
    }
    
    int ans[] = new int [arr.length]; 
    
    for(int i = ans.length - 1; i > -1; i--){
        int idx =  newarr[arr[i] - min] - 1;
        ans[idx] = arr[i];
        newarr[arr[i] - min]--;
    }
    
    for (int i = 0; i < ans.length; i++) {
      arr[i] = ans[i];
    }

  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr, min, max);
    print(arr);
  }

}