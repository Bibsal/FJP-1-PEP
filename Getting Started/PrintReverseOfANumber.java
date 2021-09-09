import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//Continiously divide by 10 till the no != 0 and keep printing the remainder        
        while(n != 0) {
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }
   }