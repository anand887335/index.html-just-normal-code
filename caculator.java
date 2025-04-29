import java.lang.classfile.instruction.OperatorInstruction;
import java.util.Scanner;

public class caculator {
    public static void main(String[] args) {
    int operator, n1 , n2 ;
    System.out.print("1-Add \n 2-Subtract \n  3-Multiply \n  4-Divide \n");
    System.out.println("Choose operator");
    Scanner sc = new Scanner(System.in);
   operator= sc.nextInt();
   System.out.print("Enter First number");
   n1 = sc.nextInt();
   System.out.print("Enter Second number");
   n2 = sc.nextInt();
   int result = 0;
   switch (operator) {
case  1:
    result = n1 + n2 ;
        
        break;
   
 case 2: 
   result = n1 - n2 ;
        break;
case 3:
        result = n1 * n2 ;
        break;
case 4:
        result = n1 / n2;
        default :
        System.out.println("Entered operater is not valid");

   }
   System.out.println("Result is : " + result);


    }
}
