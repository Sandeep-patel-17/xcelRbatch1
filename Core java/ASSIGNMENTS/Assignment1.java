import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if(marks>90){
            System.out.println("A Grade");
        }
        else if(marks>80){
            System.out.println("B Grade");
        }
        else if(marks>70){
            System.out.println("c Grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
