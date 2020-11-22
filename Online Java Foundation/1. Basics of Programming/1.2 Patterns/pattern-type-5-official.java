import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int mid = n / 2 + 1;

        for (int i = 0; i < mid; i++) {
            for (int k = i; k < mid - 1; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for (int i = mid - 1; i > 0; i--) {
            for (int k = 0; k < mid - i; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        scn.close();
    }
}