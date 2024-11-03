import java.util.Scanner;
//Find Amstrong Number in given 3 digits Number:
public class Amstrong {
    public static void main(String[]args){
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 Digit Number : ");
        int n = input.nextInt();//153
        int temp = n;//153
        int dig1,dig2,dig3;

        dig3=temp%10;//3
        temp=temp/10;//15

        dig2=temp%10;//5
        temp=temp/10;//1

        dig1=temp%10;//1
        int sum = (dig1 * dig1 * dig1)+(dig2 * dig2 *dig2)+(dig3 * dig3* dig3);
        if (sum==n){
            System.out.println(n +" Is a Amstrong Number");
        }
        else{
            System.out.println(n +" Is not a Amstrong Number");
        }*/
        //Find Amstrong Number between 100 and 999:
        int dig1,dig2,dig3;
        int n,temp,sum;
        for (n=100;n <=999;n++){
            temp =n;
            dig3=temp%10;//3
            temp=temp/10;//15

            dig2=temp%10;//5
            temp=temp/10;//1

            dig1=temp%10;//1
            sum = (dig1 * dig1 * dig1)+(dig2 * dig2 *dig2)+(dig3 * dig3* dig3);
            if (sum==n){
                System.out.println(n +" Is a Amstrong Number");
            }
        }
    }
}


