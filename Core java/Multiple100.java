import java.util.Scanner;
public class Multiple100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      if(n<=0){
        System.out.println(-1);
      }
        else
        {
            int NextMul = ((n/100)+1)*100;
            System.out.println(NextMul);
        }
      sc.close();
      }
    }
    

