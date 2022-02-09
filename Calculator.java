//package string;
//
//public class Calculator {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


package string;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // First number storage
        double num1 = getFirstNumber(); // Value - returning method.

        // Second number storage
        double num2 = getSecondNumber(); // Value - returning method.

        // Displays Math Operations menu
        showMenu(); // Void - returning method

        // Math Operation choice storage
        int choice = getSelection(); // Value - returning method

        // Calculates the users numbers into an result. No output.
        double result = doTheMath(choice, num1, num2); // Value - returning
                                                        // method

        // Displays the output with formatting to show 2 decimal places.
        displayResult(choice, result, num1, num2); // Void - returning method

    } // end of main()

    // Value - returning method =======================================
    private static double getFirstNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); // First number storage

        return num1; // Returns First number to main
    } // end of getFirstNumber()

    // Value - returning method =======================================
    private static double getSecondNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the second number - "
                + "(Cannot be zero for Divison): ");
        double num2 = input.nextDouble(); // Second number storage

        return num2;
    } // end of getSecondNumber()

    // Void - returning method ============================
    private static void showMenu() {
        System.out.print("\n1. Addition\n2. Subtract\n3. Multiply"
                + "\n4. Divide\n\nWhich math operation? "
                + "Enter your choice:  ");
    } // end of showMenu()

    // Value - returning method =======================================
    private static int getSelection() {
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt(); // Reads User pick for math operation and
                                        // stores it into 'choice'

        switch (choice) { // Start of Switch
        case 1:

            break;
        case 2:

            break;
        case 3:

            break;
        case 4:

            break;
        default:
            System.out.println("Illegal Operation");

        } // end of Switch

        return choice;
    } // end of getSelection()

    // Value - returning method =======================================
    private static double doTheMath(int choice, double num1, double num2) {
        double result;
        if (choice == 1)
            result = num1 + num2;
        else if (choice == 2)
            result = num1 - num2;
        else if (choice == 3)
            result = num1 * num2;
        else
            result = num1 / num2;

        return result;
    } // end of doTheMath(int choice, double num1, double num2)

    // Void - returning method =======================================

    private static void displayResult(int choice, double result, double num1, double num2) {
        // formatting numbers to 1 decimal places
        DecimalFormat df = new DecimalFormat("#,###,##0.0");

        if (choice == 1)
            System.out.println(num1 + " + " + num2 + " = " + df.format(result));
        else if (choice == 2)
            System.out.println(num1 + " - " + num2 + " = " + df.format(result));
        else if (choice == 3)
            System.out.println(num1 + " * " + num2 + " = " + df.format(result));
        else
            System.out.println(num1 + " / " + num2 + " = " + df.format(result));

    } // end of displayResult(int choice, double result, double num1, double
        // num2)
} // end of main()
/* Output ==========================
Enter the first number: 5

Enter the second number - (Cannot be zero for Divison): 2

1. Addition
2. Subtract
3. Multiply
4. Divide

Which math operation? Enter your choice:  4
5.0 / 2.0 = 2.5
*/