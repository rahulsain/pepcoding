import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // primeFactor(n);
        
        for(int div = 2; div * div <= n; div++){
            while(n % div == 0){
                n /= div;
                System.out.print(div+ " ");
            }
        }
        if(n!= 1)
        System.out.print(n);
        
        sc.close();
    }
    
    //using sieve of eratosthenes
    static void primeFactor(int n) {
        int flag[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            flag[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (flag[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (flag[j] == j) {
                        flag[j] = i;
                    }
                }
            }
        }

        while (n != 1) {
            System.out.print(flag[n]+ " ");
            n /= flag[n];
        }
    }
}