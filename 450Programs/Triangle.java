//Java Programs To Find Area Of Triangle
import java.util.*;
class Triangle{
   public static void main(String args[])
   {
     int area;
     int base, height;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the base of triangle:");
     base = sc.nextInt();
     System.out.println("Enter the height of a triangle:");
     height = sc.nextInt();
     
     area = (base*height)/2; 
     System.out.println("Area of a Triangle is:"+area);
  }
}

 
    