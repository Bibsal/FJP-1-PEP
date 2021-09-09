import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int temp = n;
      int div = 1;
      
      while(temp >= 10) {    // This is another way to get our divisor
          temp = temp / 10;
          div *= 10; 
      }
      
      
      
      while(div != 0) {
          int q = n / div;
          System.out.println(q);
          int rem = n % div;
          
          n = rem;
          div = div / 10;
      }
     }
    }