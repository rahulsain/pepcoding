import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("\t");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}