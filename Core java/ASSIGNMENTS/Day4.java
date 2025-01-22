import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        System.err.print("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        sc.close();
            
        }
    }
    

