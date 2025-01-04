
import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int number = scanner.nextInt();
        System.out.print("Enter your name: ");
        System.out.println("user name is: "+name);
        System.out.print("Enter your age: ");
        System.out.println("user name is: "+age);
        System.out.print("Enter your Mobile number: ");
        System.out.println("user name is: "+number);
        scanner.close();

    }
}
