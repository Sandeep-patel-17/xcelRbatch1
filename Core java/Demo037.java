import java.util.Scanner;

public class Demo037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int num3 = sc.nextInt();
        System.out.print("Enter number4: ");
        int num4 = sc.nextInt();
            if(num1>num2 && num1>num3 && num1>num4){
                System.out.println("Greater number is "+num1);

            }
            else if(num2>num1 && num2>num3 && num2>num4){
                System.out.println("Greater number is "+num2);
            }
            else if(num3>num1 && num3>num2 && num3>num4){
                System.out.println("Greater number is "+num3);
            }
            else {
               System.out.println("Greater number is "+num4);
            }
         sc.close();
        }
    }



