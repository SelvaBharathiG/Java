import java.util.Scanner;
// Using Switch Case: Calculator Program
public class Calculator {
    public static void main(String[]args){
        int a,b,ch;
        int sum,sub,mul,mod;
        double div;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a = input.nextInt();
        System.out.println("Enter the Second Number : ");
        b = input.nextInt();
        System.out.println("1.Addition ");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("Enter the Choice : ");
        ch = input.nextInt();
        switch (ch){
            case 1:
                sum = a+b;
                System.out.println("Sum of Number : "+ sum);
                break;
            case 2:
                sub = a-b;
                System.out.println("Subtraction of Number : "+ sub);
                break;
            case 3:
                mul = a*b;
                System.out.println("Multiplication of Number : "+ mul);
                break;
            case 4:
                div = (double) a/b;
                System.out.println("Division of Number : "+ div);
                break;
            case 5:
                mod = a%b;
                System.out.println("Modulus of Number : "+ mod);
                break;
            default:
                System.out.println("Invalid choice! Please select a number between 1 and 5.");
        }
        /*
                    Using Normal Function:

        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;
        System.out.println("Sum of Number : "+ sum);
        System.out.println("Subtraction of Number : "+ sub);
        System.out.println("Multiplication of Number : "+ mul);
        System.out.println("Division of Number : "+ div);
        System.out.println("Modulus of Number : "+ mod);

        case 4:
                if (b != 0) {
                    div = (double) a / b;  // Casting to double to handle float division
                    System.out.println("Division: " + div);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 5:
                if (b != 0) {
                    mod = a % b;
                    System.out.println("Modulus: " + mod);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
    */
    }
}
