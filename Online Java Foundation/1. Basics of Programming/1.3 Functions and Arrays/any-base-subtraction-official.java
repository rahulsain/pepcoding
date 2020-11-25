import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int diff = 0;
        int p = 1;
        int carry = 0;
        int tdif = 0;
        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            d2 += carry;
            if (d2 < d1) {
                d2 += b;
                carry = -1;
            } else {
                carry = 0;
            }
            tdif = (d2 - d1);
            diff += tdif * p;
            p *= 10;
        }
        return diff;
    }

}