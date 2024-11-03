import java.util.Scanner;

public class MultiTable {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Table : ");
        int s = input.nextInt();
        System.out.println("Enter the Limit : ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i + "x" + s + "=" +( s * i ));
        }
    }
}
