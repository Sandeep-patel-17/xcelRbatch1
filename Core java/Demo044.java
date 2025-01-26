
import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);
        sc.close();




    }
}
