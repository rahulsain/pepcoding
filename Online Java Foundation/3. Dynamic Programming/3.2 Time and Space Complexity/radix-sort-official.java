import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    // write code here
    int max = Integer.MIN_VALUE;
    for (int val : arr) {
      max = Math.max(max, val);
    }

    int exp = 1;

    while (exp <= max) {
      countSort(arr, exp);
      exp *= 10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    int max = 9;
    int min = 0;
    
    int newarr[] = new int[max - min + 1];

    for (int i = 0; i < arr.length; i++) {
      newarr[(arr[i] / exp) % 10 - min]++;
    }

    for (int i = 1; i < newarr.length; i++) {
      newarr[i] += newarr[i - 1];
    }

    int ans[] = new int [arr.length];

    for (int i = ans.length - 1; i > -1; i--) {
      int idx =  newarr[(arr[i] / exp) % 10 - min] - 1;
      ans[idx] = arr[i];
      newarr[(arr[i] / exp) % 10 - min]--;
    }

    for (int i = 0; i < ans.length; i++) {
      arr[i] = ans[i];
    }

    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}