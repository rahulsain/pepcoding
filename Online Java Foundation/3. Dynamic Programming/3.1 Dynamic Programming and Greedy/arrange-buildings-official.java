import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long p0, p1, c0 = 1, c1 = 1;

        for (int i = 2; i <= n; i++) {
            p0 = c0;
            p1 = c1;

            c0 = p1;
            c1 = p0 + p1;

        }

        System.out.println((c0 + c1) * (c0 + c1));
    }

}