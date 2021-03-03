package methodsUse;

import java.util.Scanner;

public class a31pattern
{

    public static void main(String[] args)

    {
        int i,
                j,
                n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = in.nextInt();
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("\n");
        }

    }
}
