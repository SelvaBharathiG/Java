import java.util.Scanner;
// Find the reverse of N digit Number:
public class ReverseNum {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n= input.nextInt();// 123
        int rem,rev=0;
        while (n!=0){
            rem=n%10; // 3  2   1
            rev=(rev*10)+rem; // (0*10)+3=3     (3*10)+2=32     (32*10)+1=321
            n=n/10; // 12 1
        }
        System.out.println("Reverse Number : "+rev);
    }
}
