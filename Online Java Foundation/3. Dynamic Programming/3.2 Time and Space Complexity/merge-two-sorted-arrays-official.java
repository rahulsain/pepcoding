import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    
    int[] m = new int[a.length+b.length];
    
    int f = 0;
    int s = 0;
    
    for(int i = 0; i< m.length; i++){
        if(f < a.length && s < b.length) {
            int min = Math.min(a[f],b[s]);
            if(min == a[f]){
                m[i] = a[f];
                f++;
            } else {
                m[i] = b[s];
                s++;
            }
        } else if (f < a.length && s == b.length){
                m[i] = a[f];
                f++;
        } else if (f== a.length && s < b.length){
                m[i] = b[s];
                s++;
        }
    }
    
    return m;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}