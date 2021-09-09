import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        //Initially no of digits is assumed to be 0
        int noofdigits = 0;  
        while(n != 0) {
            n = n / 10;
            noofdigits++;
        }
        
        System.out.println(noofdigits);
   }
  }