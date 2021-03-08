package restAssigns;

import java.util.Scanner;

public class a43exceptionHandling
{
    public static void arithmeticError(Scanner in)
    {
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number (Use 0 for Try catch example)");
        int b = in.nextInt();
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println(
                    "Dividing by zero is not determine yet (Infinity).");
        }
    }
    public static void indexError(Scanner in)
    {
        try {
            System.out.println("Enter the size of your array: ");
            int size=in.nextInt();
            String [] numbers=new String[size];
            System.out.println("Enter the values: ");
            for (int i=0;i<size;i++)
                numbers[i]=in.next();
            System.out.println("Enter the index number to find the number:" +
                    "\nTry to enter one extra index to see the exception:");
            int find =in.nextInt();
            System.out.println("Your number in that index: "+numbers[find]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of size of the array.");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: " +
                        "\n1.Check Arithmetic Error" +
                        "\n2.Index value error.  ");
        int choice=in.nextInt();
        switch(choice)
        {
            case 1:
                arithmeticError(in);
                break;
            case 2:
                indexError(in);
                break;
        }


    }
}
