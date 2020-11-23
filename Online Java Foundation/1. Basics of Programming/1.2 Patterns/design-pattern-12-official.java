import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = 0, l = 1;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                int temp = l+m;
                System.out.print(m +"	");
                m = l;
                l = temp;
            }
            System.out.println();
        }

    }
}