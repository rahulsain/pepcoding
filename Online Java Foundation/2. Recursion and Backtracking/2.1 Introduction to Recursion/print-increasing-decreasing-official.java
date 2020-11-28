import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decs(n);
        inc(n);
    }

    public static void inc(int n){
        if(n == 0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
    
    public static void decs(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        decs(n-1);
    }

}