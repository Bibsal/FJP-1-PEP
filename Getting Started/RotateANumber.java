import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int k = scn.nextInt();
       int nod = 0;
       int temp = n;
       
       while(temp != 0) {
           temp = temp / 10;
           nod++;
       }
       
       k = k % nod;
       if(k < 0) {
           k = k + nod;
       }
       
       int div = 1;
       int mult = 1;
       for(int i = 1; i <= nod; i++) {
           if(i <= k) {
               div *= 10;
           }
           else {
               mult *= 10;
           }
       }
       
       int quo = n / div;    //quotient
       int rem = n % div;    //remainder
       int rotatedVal = (rem * mult) + quo;
       System.out.print(rotatedVal);
    }
   }