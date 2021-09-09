import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        a = a * a;
        b = b * b;
        c = c * c;
        
        checkPythagoreanTriplet(a , b , c);
   }
   
   public static void checkPythagoreanTriplet(int a, int b, int c) {
       int max = Math.max(Math.max(a , c) , b);
       boolean isPythagoras = max == b + c || max == a + c || max == a + b;
       System.out.println(isPythagoras);
   }
  }