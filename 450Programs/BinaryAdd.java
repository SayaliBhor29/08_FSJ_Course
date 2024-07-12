//2.	Add two numbers/binary numbers/characters 
/*
class Add{
  public static void main(String args[]){
    int a = 20;
    int b = 10;
    
    int sum = a + b;
    System.out.println(" Addition of two numbers is:"+sum);
  }
}
*/
//Addition of binary numbers

class BinaryAdd
{
   public static void main(String args[]){
   String x ="011011", y="1010111";
   
   int num1 = Integer.parseInt(x,2);
   int num2 = Integer.parseInt(y,2);
   int sum = num1 + num2;
   
   String result = Integer.toBinaryString(sum);
   
   System.out.println("Addition of two binary numbers is:"+result);
 }
}