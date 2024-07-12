//Calculate area and circumference of a circle
//area = 3.14*r*r
//circumference=2*3.14*r

import java.util.*;
class Circle{
  public static void main(String args[])
  {
    int r;
    double area;
    double circumference;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of a circle:");
    r = sc.nextInt();
    
    area = 3.14*r*r;
    circumference = 2*3.14*r;
    
     System.out.println("Area of a Circle is:"+area);
     System.out.println("Circumference of a Circle is:"+circumference);
  }
}
    