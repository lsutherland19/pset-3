import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        float amownt;
        Scanner amount = new Scanner(System.in);
        System.out.print("Amount : ");
        amownt = amount.nextFloat();

        int quarters = (int)(amownt/0.25);
        float quartersleftOver = (float)(amownt % .25);

        int dimes = (int)(quartersleftOver/.1);
        float dimesleftOver = (float)(quartersleftOver % .10);

        int nickels = (int)(dimesleftOver/.05);
        float nickelsleftOver = (float)(dimesleftOver % .05);

        int pennies = (int)(nickelsleftOver/.01);

        System.out.println("Quarters : " + quarters);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nickels);
        System.out.println("Pennies  : " + pennies);

    }
}