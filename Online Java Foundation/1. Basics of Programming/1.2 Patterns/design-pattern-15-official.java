import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int mid = n / 2 + 1;


        for (int i = 0; i < mid; i++) {
            int in = i+1;
            for (int k = i; k < mid - 1; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print(i + 1 + "\t");
                } else {
                    if ( j <= i) {
                        System.out.print(++in + "\t");
                    } else {
                        System.out.print(--in + "\t");
                    }

                }
            }
            System.out.println();
        }

        for (int i = mid - 1; i > 0; i--) {
            int in = i;
            for (int k = 0; k < mid - i; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * i - 1; j++) {

                if (j == 0 || j == 2 * i - 2) {
                    System.out.print(i + "\t");
                    
                } else {
                    if ( j < i) {
                        System.out.print(++in + "\t");
                    } else {
                        System.out.print(--in + "\t");
                    }

                }
            }
            System.out.println();
        }
        scn.close();
    }
}