import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climb(n, 0, new int[n + 1]));
    }

    public static int climb(int n, int i, int qb[]) {
        if (i == n) {
            return 1;
        } else if (i > n) {
            return 0;
        } else if (qb[i] > 0) {
            return qb[i];
        }
        qb[i] = climb(n, i + 1, qb) + climb(n, i + 2, qb)
                + climb(n, i + 3, qb);
        return qb[i];
    }
}