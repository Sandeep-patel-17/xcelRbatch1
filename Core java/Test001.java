import java.util.Scanner;
public class Test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number up to: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==5 || i==7){
                continue;
        }
        System.out.println(i);
    }
   sc.close();

    }
}

