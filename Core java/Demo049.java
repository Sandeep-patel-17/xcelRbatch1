
import java.util.Scanner;

public class Demo049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        String strnum = String.valueOf(number);
        String reverString = "";
        for(int i=strnum.length()-1;i>=0;i--){
            reverString+=strnum.charAt(i);
        }
        System.out.println(reverString);
        sc.close();
    }
}
