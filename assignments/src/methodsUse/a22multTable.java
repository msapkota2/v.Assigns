package methodsUse;

import java.util.Scanner;

public class a22multTable
{
    public void a22multTable(int numb)
    {

        for (int i = 1; i <= 10; i++)
            System.out.println(numb + "*" + i + " = " + (numb*i));
    }
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter an integer to print it's multiplication table: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Multiplication table of " + num+ ":");
        a22multTable multiply = new a22multTable();
        multiply.a22multTable(num);

    }

}
