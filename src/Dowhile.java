import java.util.Scanner;
// Do While Loop:
public class Dowhile {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Limit : ");
        int n = input.nextInt();
        int i=2;
        do {
            System.out.println(i);
            //i++;
            i+=2;// i=i+2
        }while (i<=n);

    }
}
