import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
      

        int temp = n;
        int nod = 0;
        while(temp > 0){
            temp /= 10;
            nod++;
        }
          k = k % nod;
        if (k < 0) {
            k += nod;
        }
        
        int div = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,nod-k);
        int quo = n / div;
        
        int rem = n % div;
        n = mul * rem + quo; 
        
        System.out.println(n);
    }
}