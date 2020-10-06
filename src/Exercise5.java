import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double hwOne = in.nextDouble();
        System.out.print("Homework 2 : ");
        double hwTwo = in.nextDouble();
        System.out.print("Homework 3 : ");
        double hwThree = in.nextDouble();

        System.out.print("Quiz 1     : ");
        double quizOne = in.nextDouble();
        System.out.print("Quiz 2     : ");
        double quizTwo = in.nextDouble();

        System.out.print("Test 1     : ");
        double testOne = in.nextDouble();

        double finalHW = ( (( hwOne + hwTwo + hwThree)/3) * 0.15 );
        double finalQuiz = (((quizOne + quizTwo)/2) * 0.35);
        double finalTest = (testOne * 0.5);


        System.out.println();
        System.out.printf("%.2f",finalHW + finalQuiz + finalTest );
        System.out.println("%.");

        in.close();
    }
}