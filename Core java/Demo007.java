
import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
       

        System.out.print("Enter your mobile number: ");
        long number = sc.nextLong();
        sc.close();

        System.out.println("Your details: ");
        System.out.println("Name: "+name );
        System.out.println("Age: "+age );
        System.out.println("Mobile Number: "+number );
        sc.close();

    }
}
