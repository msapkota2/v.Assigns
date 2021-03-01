package methodsUse;

import java.util.Scanner;

public class a23sumNth
{
    int a23sumNth(int num)
    {
        int i=1,sum=0;
        while(i<=num)
        {
            sum+=i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the term of the number in integer value: ");
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        a23sumNth sum = new a23sumNth();
        int  summation =sum.a23sumNth(num);
        System.out.println("The sum to its "+ num+"th term is: " + summation);
    }
}
