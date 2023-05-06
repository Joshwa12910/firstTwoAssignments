import java.util.Scanner;
//**************************************************************
//                   Assignment #3
//                    Name: Joshua Williams
//                    Data Structures Date: Date of Submission (2/1/2023)
//***************************************************************
//The task of the EvenOrOdd class is to prompt the user to enter a number and then
//determine if that number is even or odd. It does this by using a Scanner object to read the
//user's input, and then using an if/else statement to test if the number is divisible by 2
//(i.e. if the remainder when the number is divided by 2 is 0). If the number is divisible by 2,
//the program outputs that the number is even. If the number is not divisible by 2, the
//program outputs that the number is odd.
//*****************************************************************
// The EvenOrOdd class does not have any parameters. The only input it requires is the
// number entered by the user, which is obtained through the Scanner object.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
