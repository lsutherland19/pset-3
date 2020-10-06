import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wage : ");
        double dailyWage = input.nextDouble();

        System.out.println("Monday : ");
        double monDay = input.nextDouble();
        System.out.println("Tuesday : ");
        double tuesDay = input.nextDouble();
        System.out.println("Wednesday : ");
        double wednesDay = input.nextDouble();
        System.out.println("Thursday : ");
        double thursDay = input.nextDouble();
        System.out.println("Friday : ");
        double friDay = input.nextDouble();
        System.out.println("Saturday : ");
        double saturDay = input.nextDouble();
        System.out.println("Sunday : ");
        double sunDay = input.nextDouble();

        double totalHours = monDay + tuesDay + wednesDay + thursDay + friDay + saturDay + sunDay;
        double salary = totalHours * dailyWage;
        System.out.printf("%n$%,.2f.", salary);

    }
}