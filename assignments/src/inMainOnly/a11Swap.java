package inMainOnly;

import java.util.Scanner;

public class a11Swap
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a,b;
        int choice;
        int temp;
        System.out.print("Enter the first number: ");
        a=in.nextInt();
        System.out.print("\nEnter the second number: ");
        b=in.nextInt();
        System.out.println("Swap numbers: ");
        System.out.println("1. using temp variables.");
        System.out.println("2. without using temp variables.");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
                temp =a;
                a=b;
                b=temp ;
                System.out.println("After swap: ");
                System.out.print("\nThe first number becomes "+ a);
                System.out.print("\nThe second number becomes "+ b);
                break;
            case 2:
                a=a+b;
                b=a-b;
                a=a-b;
                System.out.println("After swap: ");
                System.out.print("The first number becomes "+ a);
                System.out.print("\nThe second number becomes "+ b);
                break;
            default:
                break;
        }
    }
}
