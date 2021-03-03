package methodsUse;

import java.util.Scanner;

public class a30fibonacci {
    static void fibonacci(int n)
    {
        int first=0,
                next=1,
                i=0;
        while(i<n)
        {
            System.out.print(" " + next);
            int sum = first + next;
            first = next;
            next = sum;
       i++;
        }

    }

    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the required number of fibonacci series: ");
        int num=in.nextInt();
        fibonacci(num);
    }
}
