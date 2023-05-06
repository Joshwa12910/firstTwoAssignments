import java.util.Scanner;
public class TestScores {
    //**************************************************************
    //                   Assignment #2
    //                    Name: Joshua Williams
    //                    Data Structures Date: Date of Submission (1/30/2023)
    //***************************************************************
    //The first task is to ask the user to enter the amount of books,
    // then display their points.
    // This task is accomplished by using the Scanner class to collect the user's books purchased as int inputs.
    // If statements are then used to find the amount of points you got,
    // with a certain number of books corresponding with the amount of points.
    //*****************************************************************
    // The second task is to ask the user to enter three numbers, and then perform a mathematical operation on these numbers.
    // The operation includes finding the average of the three scores.
    // The results are then put through many If statements to find the letter grade based on the average.
    //*****************************************************************
    // The first task uses one parameter, the input numBooks
    // The second task uses three parameters, the three test scores, scoreOne, scoreTwo, and scoreThree.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first score: ");
        int scoreOne = input.nextInt();
        System.out.println("Please enter the second score: ");
        int scoreTwo = input.nextInt();
        System.out.println("Please enter the third score: ");
        int scoreThree = input.nextInt();

        int average = (scoreOne + scoreTwo + scoreThree) / 3;

        System.out.println("The average of these scores is: " + average);
        String score = "";
        if (average >= 90){
            score = "A";
        }else if (average >= 80) {
            score = "B";
        }else if (average >= 70) {
            score = "C";
        }else if (average >= 60) {
            score = "D";
        }else{
            score = "F";
        }
    }
}
