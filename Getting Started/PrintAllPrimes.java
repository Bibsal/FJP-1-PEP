import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int low = scn.nextInt();  //Taking input for low value 
        int high = scn.nextInt(); //Till The high value
        
//From low to high it checks for each low value(i.e assigned to n) and prints if it is prime
        for(int n = low; n <= high; n++) { 
            int count = 0;
            for(int div = 2; div * div <= n; div++) {
                if(n % div == 0) {
                    count++;
                    break;
                }
            }
            
            if(count == 0) {
                System.out.println(n);
            }
        }
    }
}