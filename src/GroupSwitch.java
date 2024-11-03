import java.util.Scanner;
// Group Switch Using to Finding Vowels and Consonant
public class GroupSwitch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        char c;
        System.out.println("Enter The Character :");
        c=input.next().charAt(0);
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " Is a Vowels");
                break;
            default:
                System.out.println(c + " Is a Consonant");

        }
    }
}
