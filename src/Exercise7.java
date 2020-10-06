
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Salary : ");
        double salary = in.nextDouble();

        System.out.print("401(k) : ");
        double fourOhOneK = in.nextDouble();

        System.out.print("Federal: ");
        double federal = in.nextDouble();

        System.out.print("State  : ");
        double state = in.nextDouble();

        double biweekly = salary / 24;
        double deduct401k = biweekly * (fourOhOneK/100);
        biweekly = biweekly - deduct401k;

        double deductFederal = biweekly * (federal/100);
        double deductState = biweekly * (state/100);

        System.out.println();
        System.out.print("$");
        System.out.printf("%,.2f", biweekly - (deductFederal + deductState)  );
        System.out.print(".");

        in.close();
    }
}