//Calculate Power of a number

import java.util.*;
class Power{
 public static void main(String args[])
{
 int base, exponent;
 int result=1;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number:");
 base = sc.nextInt();
 System.out.println("Enter the exponent:");
 exponent = sc.nextInt();
for(int i = 0; i<exponent; i++){
 
 result*= base;
  }
  System.out.println(base + "raised to the power of" + exponent + "is" + result);
 }
}
 
 
