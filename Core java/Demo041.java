import java.util.Scanner;
public class Demo041{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch(ch) {
            case 'a':
            System.out.println("Vowel");
            break;
            case 'e':
            System.out.println("Vowel");
            break;
            case 'i':
            System.out.println("Vowel");
            break;
            case 'o':
            System.out.println("Vowel");
            break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        sc.close();
    }
}