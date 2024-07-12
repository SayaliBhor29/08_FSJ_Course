/*A = amount · P = principal · r = rate of interest · n = number of times interest is compounded per year · t = time (in years).*/
//Formula Compound interest = A = P(1+r/n)^nt
/*A=amount
p=Principal
r=Interest rate(decimal)
n=no.of times interest is compounded per year
t=time(in years)
CI = A-P
CI=P(1+r/n)^nt-P
*/
import java.util.*;
class CompoundInt{
  public static void main(String args[]){
    double p;
    double r;
    double n;
    int t;
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Principal Amount:");
    p = sc.nextDouble();
    System.out.println("Enter rate of Interest:");
    r = sc.nextDouble();
    System.out.println("Enter the No.of times interest is compounded per year:");
    n = sc.nextDouble();
    System.out.println("Enter the time(in year):");
    t = sc.nextInt();
    
    double CI = p*(Math.pow((1+r/100),(n*t)))-p;
    System.out.println("Coumpound interest is:"+CI);
  }
}
    
    