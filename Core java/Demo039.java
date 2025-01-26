
import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println("Lowercase Character");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("Uppercase Character");
        }
        else if(Character.isDigit(ch)){
            System.out.println("Digit"); 
        }
        else{
            System.out.println("Special Character");

        }
       
     sc.close();

    }
}
