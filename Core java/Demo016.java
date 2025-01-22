import java.util.Scanner;
public class Demo016 {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String reversingString = "";
        for(int i = name.length()-1;i>=0;i--){
            reversingString += name.charAt(i);
        }
        
        if(name.equals(reversingString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}