package methodsUse;

import java.util.Scanner;

public class a26reverseNum
{
    static int reversDigits(int num)
    {
        int reverse = 0;
        while(num > 0)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num = num / 10;
        }
        return reverse;
    }
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to get the reverse: ");
        int num=in.nextInt();
        System.out.println("The reverse of the given number is "
                + reversDigits(num));
    }
}
