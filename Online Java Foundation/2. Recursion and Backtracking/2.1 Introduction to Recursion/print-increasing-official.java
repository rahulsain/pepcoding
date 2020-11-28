import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inc(n);
    }

    public static void inc(int n){
        if(n == 0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }

}