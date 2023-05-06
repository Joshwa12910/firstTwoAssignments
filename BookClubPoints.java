import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of books purchased this month: ");
        int numBooks = input.nextInt();

        int points;
        if (numBooks == 0) {
            points = 0;
        } else if (numBooks == 1) {
            points = 5;
        } else if (numBooks == 2) {
            points = 15;
        } else if (numBooks == 3) {
            points = 30;
        } else {
            points = 60;
        }

        System.out.println("You have earned " + points + " points this month.");
    }
}