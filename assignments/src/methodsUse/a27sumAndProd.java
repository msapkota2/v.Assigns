package methodsUse;

import java.util.Scanner;

public class a27sumAndProd
{
    public static void sum(int num)
    {
        int summ=0;
        while(num>0)
        {
            int remainder=num%10;
            summ+=remainder;
            num/=10;
        }
        System.out.println("The sum of the given number is: " + summ);
    }

    public static void multipy(int num)
    {
        int multi=1;
        while(num>0)
        {
            int remainder=num%10;
            multi*=remainder;
            num/=10;
        }
        System.out.println("The sum of the given number is: " + multi);

    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        sum(num);
        multipy(num);
    }
}
