//Character Is Vowel or Consonant
import java.util.*;
class Vowel{
   public static void main(String args[]){
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Character:");
    char ch = sc.next().charAt(0);

    if(ch == 'A' ||ch== 'a' ||ch== 'I' ||ch== 'i' ||ch== 'O' ||ch== 'o' || ch=='E' ||ch== 'e' ||ch== 'U' || ch=='u'){
       System.out.println("The character is a Vowel.");
       }
     else{
        System.out.println("The character is Consonant.");
      }
     }
  }