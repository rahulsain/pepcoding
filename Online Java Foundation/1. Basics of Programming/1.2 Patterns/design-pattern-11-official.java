import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = 1;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(m++ +"	");
            }
            System.out.println();
        }

    }
}