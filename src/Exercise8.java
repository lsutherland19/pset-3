import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Students : ");
        int students = in.nextInt();

        System.out.print("Teachers : ");
        int teachers = in.nextInt();

        System.out.print("Capacity : ");
        int capacity = in.nextInt();

        int totalPeople = students + teachers;
        int overflow = totalPeople % capacity;

        int busses = ((students + teachers + capacity - 1)/capacity);

        System.out.print("\n");
        System.out.println("Buses required      : " + busses );
        System.out.println("Overflow passengers : " + overflow);

        in.close();
    }
}