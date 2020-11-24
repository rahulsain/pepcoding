import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = getValueInAnyBase(n, b1, b2);
        System.out.println(d);
    }

    public static int getValueInAnyBase(int n, int b1, int b2) {
        int d = getValueIndecimal(n, b1);
        int p = getValueInBase(d, b2);
        return p;
    }
    public static int getValueInBase(int n, int b) {
        int dn = 0;
        int p = 1;
        while (n > 0) {
            int temp = n % b;
            n /= b;
            dn += temp * p;
            p *= 10;
        }
        return dn;
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