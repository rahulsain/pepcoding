import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int gcd,lcm;
      
      gcd = hcf(n1,n2);
      lcm = (n1*n2)/gcd;
      
      System.out.println(gcd);
      System.out.println(lcm);
     }
     public static int hcf(int a,int b){
         if(b == 0)
            return a;
         return hcf(b,a%b);
     }
    }