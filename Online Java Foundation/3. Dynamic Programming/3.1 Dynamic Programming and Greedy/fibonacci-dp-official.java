import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n, new int[n + 1]));
    }

    public static int fib(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        qb[n] = fib(n - 1, qb) + fib(n - 2, qb);
        return qb[n];
    }

}