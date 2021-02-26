package inMainOnly;

import java.util.Scanner;

public class a3SumAve
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a, b;
        System.out.print("Enter the first number: ");
        a=in.nextDouble();
        System.out.print("\nEnter the second number:");
        b=in.nextDouble();
        System.out.println("\nThe sum of given numbers is "+(a+b));
        System.out.println("\nThe average of given numbers is "+(a+b)/2);

    }
}
