
import java.util.Scanner;

public class ConMintoYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        int minutes = sc.nextInt();
        long min_in_hour  = 60;
        long hours_in_day = 24;
        long days_in_years = 365;
        
        long minutes_in_year = min_in_hour*hours_in_day*days_in_years;
        double years = (double)(minutes/minutes_in_year);

        System.out.println(minutes+ " minutes to years "+years);
        
      
    sc.close();

    }
}
