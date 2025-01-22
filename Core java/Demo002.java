import java.util.Scanner;
public  class Demo002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }
    sc.close();
    }
    
}
