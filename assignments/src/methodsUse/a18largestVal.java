package methodsUse;

import java.util.Scanner;

public class a18largestVal
{
    static int largestVal(int x, int y, int z)
    {
        if (x>=y && x>=z)
            return x;
        else if (y>=x && y>=z)
            return y;
        else
            return z;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the first integer: ");
        x=in.nextInt();
        System.out.println("Enter the second integer: ");
        y=in.nextInt();
        System.out.println("Enter the third integer: ");
        z=in.nextInt();

        int largest=largestVal(x,y,z);
        System.out.println("The largest number from given three values is "+largest);

    }
}
