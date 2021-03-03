package methodsUse;

import java.util.Scanner;

public class a28primeN
{
    static boolean isPrimenumber(int num)
    {
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if (num%i==0)
               return false;

        }
        return true;
    }

    static void firstNthPrime(int num)
    {
        System.out.print("The first "+num+" prime(s): ");
        for(int i=2;i<=num;i++)
        {
            if(isPrimenumber(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    static void allPrimebetween(int start,int end)
    {
        System.out.println("List of prime numbers between "+start+" and "+end+":");
        for(int i=start;i<=end;i++)
        {
        if(isPrimenumber(i))
        {
            System.out.print(i+" ");
        }
        }
    }
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter" +
                "\n1.isPrimenumber " +
                "\n2.firstNthPrime" +
                "\n3.allPrimebetween");
        int num=in.nextInt();
        if(num==1)
        {
            System.out.println("Enter the number: ");
            int number=in.nextInt();
            if(isPrimenumber(number))
            {
                System.out.println("It is a prime number.");
            }
            else
                System.out.println("It is not a prime number.");
        }
        if(num==2)
        {
            System.out.println("Enter the end number: ");
            int numberTh=in.nextInt();
            firstNthPrime(numberTh);
        }
        if(num==3)
        {
            System.out.print("Enter starting number: ");
            int start= in.nextInt();
            System.out.println("Enter ending number: ");
            int end=in.nextInt();
            allPrimebetween(start,end);
        }

    }
}
