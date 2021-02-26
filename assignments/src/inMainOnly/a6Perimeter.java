package inMainOnly;

import java.util.Scanner;

public class a6Perimeter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to find the perimeter of circle\n" +
                "Enter 2 to find the perimeter of rectangle\n" +
                "Enter 3 to find the perimeter of triangle\n");
        System.out.println("Enter Here:    ");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Enter the radius of a circle: ");
            double rad = in.nextDouble();
            System.out.println("The area of circle is: " + (2*Math.PI * rad));
        }
        if (num == 2) {
            System.out.println("Enter the length of a rectangle: ");
            double len = in.nextDouble();
            System.out.println("Enter the width of a rectangle: ");
            double wid = in.nextDouble();
            System.out.println("The area of rectangle is: " + 2*(len+ wid));
        }
        if (num == 3) {
            System.out.println("Enter the base of a triangle: ");
            double base = in.nextDouble();
            System.out.println("Enter the height of a triangle: ");
            double height = in.nextDouble();
            System.out.println("Enter the perpendicular of a triangle: ");
            double perp = in.nextDouble();
            System.out.println("The area of triangle is: " + (base+height+perp));
        }

    }
}