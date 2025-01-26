
import java.util.Scanner;

public class Demo042 {
   public static void main(String[] args) {
    System.out.print("Enter LowerCase Character: ");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.println("UpperCase Character:"+Character.toUpperCase(ch));
    sc.close();
    
   } 
}
