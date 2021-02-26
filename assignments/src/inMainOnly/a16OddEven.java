package inMainOnly;

import java.util.Scanner;

public class a16OddEven
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number;
        String choice;
        do {
            System.out.println("Enter the integer number: ");
            number = in.nextInt();

            if (number % 2 == 0)
                System.out.println("The number is even.");
            else
                System.out.println("The number is odd.");
            System.out.println("\n Would you like to try again? (y/n): ");
            choice= in.next();
        }while(choice.equals("y")||choice.equals("Y"));
    }
}
