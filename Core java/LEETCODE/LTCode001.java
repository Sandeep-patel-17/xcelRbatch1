package LEETCODE;
import java.util.Scanner;
class LTCode001 {
    public boolean isPalindrome(int x) {
       
        String str = String.valueOf(x);
        StringBuilder reversedStr = new StringBuilder();
   
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return str.equals(reversedStr.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int x = sc.nextInt();
        sc.close();

        LTCode001 solution = new LTCode001();
        if (solution.isPalindrome(x)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
} 
    


    

