package inMainOnly;

import java.util.Scanner;

public class a10Formulas
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 to distance using SUVAT\n" +
                "Enter 2 to find the area of a triangle using heron's formula\n" +
                "Enter 3 to find the value of x using quadratic formula\n");
        System.out.println("Enter Here:    ");
        int num=in.nextInt();
        if (num==1)
        {
            System.out.print("Enter the initial velocity: ");
            double u=in.nextDouble();
            System.out.print("Enter the time: ");
            double time=in.nextDouble();
            System.out.print("Enter the initial acceleration: ");
            double acc=in.nextDouble();
            double s = (u*time)-(0.5)*acc*Math.pow(time,2);
            System.out.println("The area of circle is: " +s);
        }
        if (num==2)
        {
            System.out.println("Enter the first side of a triangle: ");
            double a=in.nextDouble();
            System.out.println("Enter the second side of a triangle: ");
            double b=in.nextDouble();
            System.out.println("Enter the third side of a triangle: ");
            double c=in.nextDouble();
            //half of the perimeter
             double s =(a+b+c)/2;
             //inside square root
             double value=s*(s-a)*(s-b)*(s-c);
             double area=Math.sqrt(value);
            System.out.println("The area of the triangle is: " + area);
        }
        if(num==3)
        {
            System.out.println("Compare the equation with ax^2+bx+c=0");
            System.out.println("Enter the value of 'a': ");
            double a=in.nextDouble();
            System.out.println("Enter the value of 'b': ");
            double b=in.nextDouble();
            System.out.println("Enter the value of 'c': ");
            double c=in.nextDouble();
            double x=(-b+Math.sqrt((b*b)-4*a*c)/2*a);
            System.out.println("The one value of x: " + x);
        }

    }
}
