package methodsUse;

import java.util.Scanner;

public class a24factNumb
{
    public static void factorial(int num)
    {
        int factorial=1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }

        System.out.println("Factorial of "+ num+" = " +num+"! = "+ factorial);
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num=in.nextInt();
        factorial(num);
    }
}
