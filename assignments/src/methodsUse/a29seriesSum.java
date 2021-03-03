package methodsUse;

import java.util.Scanner;

public class a29seriesSum
{

    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the final nth number: ");
        int num = in.nextInt();
        System.out.println(sum(num));
    }

    static int factorial(int n)
    {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
     static double sum(int n)
    {
        double sum = 0;
        for (int i = 0; i <n; i++)
            sum += (1.0+i)/factorial(i+1);
        return sum;
    }

}
