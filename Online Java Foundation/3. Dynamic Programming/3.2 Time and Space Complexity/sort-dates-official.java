import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    // write your code here
    countSort(arr,1000000,1,32); //dd
    countSort(arr,10000,100,13); //mm
    countSort(arr,1,10000,2501); //yyyy
  }
  

 public static void countSort(String[] arr,int div, int mod, int range) {

    int min = 0;

    int newarr[] = new int[range];

    for (int i = 0; i < arr.length; i++) {
      newarr[Integer.parseInt(arr[i] ,10) / div % mod - min]++;
    }

    for (int i = 1; i < newarr.length; i++) {
      newarr[i] += newarr[i - 1];
    }

    String ans[] = new String [arr.length];

    for (int i = ans.length - 1; i > -1; i--) {
      int idx =  newarr[Integer.parseInt(arr[i] ,10) / div % mod - min] - 1;
      ans[idx] = arr[i];
      newarr[Integer.parseInt(arr[i] ,10) / div % mod - min]--;
    }

    for (int i = 0; i < ans.length; i++) {
      arr[i] = ans[i];
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}