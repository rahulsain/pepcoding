import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("*\t");
                } else {
                    if (i == 0 && j < mid) {
                        System.out.print("*\t");
                    } else if (j == n - 1 && i < mid) {
                        System.out.print("*\t");
                    } else if (i == n - 1 && j > mid) {
                        System.out.print("*\t");
                    } else if (j == 0 && i > mid) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }

    }
}