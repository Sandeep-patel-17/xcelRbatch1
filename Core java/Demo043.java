
import java.util.Scanner;

public class Demo043 {
   public static void main(String[] args) {
    System.out.print("Enter UpperCase Character: ");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.println("LowerCase Character:"+Character.toLowerCase(ch));
    sc.close();
    
   } 
}
