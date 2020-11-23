import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int d = 0;
        int p = 1;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
             d += temp * p;
            p *= b;
        }
        return d;
    }
}