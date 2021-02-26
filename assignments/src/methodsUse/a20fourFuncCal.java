package methodsUse;
import java.util.Scanner;

public class a20fourFuncCal
{
    public static void main(String[] args) {
    // declare required variables
    double num1, num2,
            sum, sub,
            mult, div;
    char operator,ch;
    boolean flag = true;

    Scanner in = new Scanner(System.in);
    while(flag){
        System.out.print("Enter two numbers giving a space: ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        System.out.println("Which arithmetic operation you would like to perform?\n"
                + "1. Addition \n"
                + "2. Subtraction \n"
                + "3. Multiplication \n"
                + "4. Division \n"
                + "7. Exit");
        System.out.print("Enter the option number: ");
        operator = in.next().charAt(0);
        switch (operator) {

            case '1':
                sum = add(num1, num2);
                System.out.println("\nThe sum of given two number is " +sum);
                break;

            case '2':
                sub = subtract(num1, num2);
                System.out.println("\nThe subtraction of given two number is "+ sub);
                break;

            case '3':
                mult = multiply(num1, num2);
                System.out.println("\nThe multiplication of given two number is " + mult);
                break;

            case '4':
                div = division(num1, num2);
                System.out.println("\nThe division of given two number is " + div);
                break;

            case '7':
                System.exit(0);

            default:
                System.out.println("\nInvalid operator");
        }
            //if the user wants to continue
        System.out.println("\nDo you want to continue?");
        System.out.print("Enter (Y/N): ");
        ch = in.next().charAt(0);
            //to ignore cases
        if (Character.toUpperCase(ch) != 'Y')
            flag = false;
        System.out.println(); // space
    } // while loop
}
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // method to calculate division of two numbers
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}