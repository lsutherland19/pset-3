import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit  : ");
        double f = in.nextDouble();
        double c = (f - 32) * .56;
        double k = c+273.15;

        System.out.printf("Celsius   :  %.2f\n", c);
        System.out.printf("Kelvin    :  %.2f\n", k);
        in.close();
    }

}