import java.util.Scanner;
// While Loop:
public class While {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter th Limit : ");
        int n = input.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}
