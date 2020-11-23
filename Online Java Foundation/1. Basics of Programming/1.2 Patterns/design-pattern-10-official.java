import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int mid = n / 2;
        
        for (int k = 0; k < mid; k++) {
            System.out.print("\t");
        }

        System.out.println("*");
        
        for (int i = mid-1; i > 0; i--) {
            for (int k = i; k > 0; k--) {
                System.out.print("\t");
            }

            System.out.print("*\t");
            for (int k = 2 * (mid - i) - 1; k > 0; k--) {
                System.out.print("\t");
            }

            System.out.println("*");
        }

        for (int i = 0; i < mid; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("\t");
            }

            System.out.print("*\t");
            for (int k = 0; k < 2 * (mid - i) - 1; k++) {
                System.out.print("\t");
            }

            System.out.println("*");
        }

        for (int k = 0; k < mid; k++) {
            System.out.print("\t");
        }

        System.out.println("*");

        


        scn.close();
    }
}