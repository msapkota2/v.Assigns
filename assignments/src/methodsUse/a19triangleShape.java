package methodsUse;

import java.util.Scanner;

public class a19triangleShape
{
    static void triangleShape(int x, int y, int z)
    {

        if (x == y && y == z )
            System.out.println("The Triangle is Equilateral Triangle");

        else if (x == y || y == z || z == x )
            System.out.println("The Triangle is Isoceles Triangle");

        else
            System.out.println("The Triangle is Scalene Triangle");
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
        triangleShape(x, y, z);
    }
}
