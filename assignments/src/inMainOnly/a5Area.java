package inMainOnly;

import java.util.*;
import java.lang.Math;
public class a5Area
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to find the area of circle\n" +
                           "Enter 2 to find the area of rectangle\n" +
                           "Enter 3 to find the area of triangle\n");
        System.out.println("Enter Here:    ");
        int num=in.nextInt();
        if (num==1)
        {
            System.out.println("Enter the radius of a circle: ");
            double rad=in.nextDouble();
            System.out.println("The area of circle is: " + (Math.PI*rad*rad));
        }
        if (num==2)
        {
            System.out.println("Enter the length of a rectangle: ");
            double len=in.nextDouble();
            System.out.println("Enter the width of a rectangle: ");
            double wid=in.nextDouble();
            System.out.println("The area of rectangle is: " + (len*wid));
        }
        if(num==3)
        {
            System.out.println("Enter the base of a triangle: ");
            double base=in.nextDouble();
            System.out.println("Enter the height of a triangle: ");
            double height=in.nextDouble();
            System.out.println("The area of triangle is: " + (1/2*base*height));
        }

    }
}
