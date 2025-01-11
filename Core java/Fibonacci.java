import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args){
        System.err.print("Enter Fibonacci sequence upto: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){
            System.err.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
            sc.close();
        }
    }
}
