import java.util.Scanner;
// Find the Sum and Average of given n numbers:
public class SumAndAvg {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Limit :");
        int n = input.nextInt();
        int sum =0,a;
        for (int i=1;i<=n;i++){
            System.out.println("Enter The "+i+" Number");
            a=input.nextInt();
            sum +=a;//sum = sum+a
        }
        System.out.println("The Sum of Number :"+sum);
        System.out.println("The Average Of Number :"+sum/n);
    }
}
