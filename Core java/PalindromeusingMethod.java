import java.util.Scanner;
public class PalindromeusingMethod {
    public static void ispalindrome(int num){
       String numStr = Long.toString(num);
       String reversestring = "";
       for(int i = numStr.length()-1;i>=0;i--){
        reversestring += numStr.charAt(i);
       }
       if(num<0){
        System.out.println("-1");
       }
       else if(numStr.equals(reversestring)){
        System.out.println("1");
       } 
       else{
        System.out.println("0");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");   
            int num = sc.nextInt();
             ispalindrome(num);
                 sc.close();
     }
 }
    

