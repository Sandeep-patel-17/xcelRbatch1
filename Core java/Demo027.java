import java.util.Scanner;
public class Demo027 {
    public static void main(String[] args){
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Prime Number");
        }
       
        else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
    
    
}
