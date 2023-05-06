import java.util.Scanner;
//**************************************************************
//                   Assignment #3
//                    Name: Joshua Williams
//                    Data Structures Date: Date of Submission (2/1/2023)
//***************************************************************
// The task of this class, Triangles, is to prompt the user to enter the lengths of the 3 sides of a triangle,
// and then use if/else statements to determine the type of the triangle based on the lengths of the sides.
// The program will print whether the triangle is equilateral, isosceles, or scalene,
// depending on whether all three sides have equal lengths, two sides have equal lengths, or no sides have equal lengths,
// respectively.
//*****************************************************************
// This class doesn't use any parameters, only standard input
public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int side1 = input.nextInt();

        System.out.print("Enter the length of the second side: ");
        int side2 = input.nextInt();

        System.out.print("Enter the length of the third side: ");
        int side3 = input.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}




