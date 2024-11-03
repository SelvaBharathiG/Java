import java.util.Scanner;
// Find the fibonacci series of given number:
public class Fibonacci {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Limit :");
        int n = input.nextInt();
        int a=-1,b=1,c;
        for (int i=1;i<=n;i++){
            c=a+b;// -1+1=0    1+0=1   0+1=1    1+1=2   1+2=3
            System.out.println(c);
            a=b;// 1   0   1   1   2
            b=c;// 0   1   1   2   3
        }
    }
}
