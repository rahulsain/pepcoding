import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c > b && c > a) {
            int temp = a;
            a = c;
            c = temp;
        } else if (b > a && b > c) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(triplet(a, b, c));

    }
    static boolean triplet(int a, int b, int c) {
        return ((a * a) == ((b * b) + (c * c)));
    }
}