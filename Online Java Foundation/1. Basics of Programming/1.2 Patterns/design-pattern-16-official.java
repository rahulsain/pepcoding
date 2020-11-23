import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = 2 * n - 3;

        for (int i = 0; i < n; i++) {
            int temp = 0;
            int stp = sp;
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j <= i) {
                    System.out.print(++temp + "\t");
                } else if (stp > 0) {
                    System.out.print("\t");
                    stp--;
                } else {
                    if (temp == n) {
                        temp--;
                    }
                    System.out.print(temp-- + "\t");
                }
            }
            sp -= 2;
            System.out.println();
        }

    }
}