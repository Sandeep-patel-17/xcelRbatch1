import java.util.Scanner;

public class Demo012{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double result = 3.14*(radius*radius);
        System.out.println("Area of circle: "+result);
        sc.close();
}
}