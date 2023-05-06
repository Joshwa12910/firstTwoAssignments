import javax.swing.JOptionPane;
//**************************************************************
//                   Assignment #3
//                    Name: Joshua Williams
//                    Data Structures Date: Date of Submission (2/1/2023)
//***************************************************************
//The task of this class, Login is to prompt the user to enter their username and password,
//and then use if/else if/else statements to check if the inputs match the correct credentials
// stored in the userName and password variables. Depending on the result of the comparison,
// the program will display different messages to the user
// If neither input matches the correct credentials, the program will display a message
// indicating that both the username and password are incorrect.
//*****************************************************************
// This class uses multiple parameters, including:
// userName - string variable that holds the username.
// password - string variable that holds the password.
// name - string variable that holds the username input.
// pw - string variable that holds the password input.
public class Login {
    public static void main(String[] args) {
        String userName = "name";
        String password = "password";

        String name = JOptionPane.showInputDialog("Please enter your username: ");
        String pw = JOptionPane.showInputDialog("Please enter your password: ");

        if(name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        } else if(name.equals(userName)) {
            JOptionPane.showMessageDialog(null, "Wrong Password!");
        } else if(pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Wrong Username!");
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username AND Password!");
        }
    }
}
