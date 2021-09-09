import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int op = 1; //Original Position
    int inverse = 0;
    while(n != 0) {
        int rem = n % 10;
        n = n / 10;
        
        inverse += op * (int)Math.pow(10 , rem - 1);
        
        op++;
    }
    
    System.out.println(inverse);
 }
}