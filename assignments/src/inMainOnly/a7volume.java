package inMainOnly;

import java.util.Scanner;
import java.lang.Math;
public class a7volume
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder: ");
        double rad = in.nextDouble();
        System.out.println("Enter the length of a cylinder: ");
        double len = in.nextDouble();
        System.out.println("The Volume of a cylinder: " + (Math.PI*Math.pow(rad,2)*len));
    }
}
