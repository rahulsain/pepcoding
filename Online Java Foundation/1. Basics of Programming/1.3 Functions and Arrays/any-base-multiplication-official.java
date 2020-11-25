import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int temp = 1;
        int sum = 0;
        int ptem = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 /= 10;
            temp = n1;
            int c = 0;
            int p = 1;
            int tem = 0;
            while (temp > 0 || c > 0) {
                int d1 = temp % 10;
                temp /= 10;
                int rem = ((d1 * d2) + c) % b;
                c = ((d1 * d2) + c) / b;
                tem += rem * p;
                p *= 10;
            }
            sum = getSum(b, sum, tem * ptem);
            ptem *= 10;
        }
        return sum;
    }

    public static int getSum(int b, int n1, int n2) {
        int sum = 0;
        int p = 1;
        int carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int tsum = (d1 + d2 + carry) % b;
            carry = (d1 + d2 + carry) / b;
            sum += tsum * p;
            p *= 10;
        }
        return sum;
    }

}