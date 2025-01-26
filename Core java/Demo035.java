import java.util.Scanner;
public class Demo035 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
            if(num1>num2){
                System.out.println("Greater is number1");

            }
            else{
               System.out.println("Greater is number2");
            }
         sc.close();
        }
    }


