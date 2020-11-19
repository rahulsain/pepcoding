import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i * i <=n; i++){
            System.out.println(i*i);
        }
        
        
        
        // my bad approach->
        
        // boolean bulb[] = new boolean[n+1];
        
        // for(int i = 1; i<=n; i+=i){
        //     bulb[i] = !(bulb[i]);
        // }
        
        // for(int i = 1; i<=n; i++){
        //     if(bulb[i] == true){
        //         System.out.println(i);
        //     }
        // }
    }
}