import java.util.Scanner;
public class AreaRect {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        double result = length*breadth;
        System.out.println("Area of Rectangle:"+result);
       sc.close();
}
}

