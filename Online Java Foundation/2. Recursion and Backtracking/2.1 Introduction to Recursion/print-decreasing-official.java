import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decs(n);
    }

    public static void decs(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        decs(n-1);
    }

}