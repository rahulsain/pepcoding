import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int coeff = 1;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                coeff = (j==0||i==0)?1:coeff*(i-j+1)/j;
                System.out.print(coeff +"	");
                
            }
            System.out.println();
        }

    }
}