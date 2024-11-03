import java.util.Scanner;
// Factorial Program:
public class Factorial {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Factorial Number :");
        int n = input.nextInt();
        int s = 1;
        for (int i=1;i<=n;i++){
            s = s * i;// s*=i
        }
        System.out.println("Factorial of " + n +" is " + s);
    }
}
