import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = n / 2;
        int temp = 1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < temp; j++) {

                System.out.print("*\t");

            }
            if (temp == n) {
                temp = n / 2 + 1;
            }
            if (i < (n / 2) - 1) {
                temp++;
                sp = n / 2;
            } else if (i == (n / 2) - 1) {
                temp = n;
                sp = 0;
            } else {
                temp--;
                sp = n / 2;
            }
            System.out.println();
        }

    }
}