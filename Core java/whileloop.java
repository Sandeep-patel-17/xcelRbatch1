
import java.util.Scanner;

public class whileloop {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String password = sc.nextLine();
    while((name.equals("sandeep")) && (password.equals("sandy"))){
        System.out.println("Hello user Happy New Year");
        break;

    }
    sc.close();
  }  
}
