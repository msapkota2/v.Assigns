package inMainOnly;

import java.util.Scanner;

public class a8TempConversion
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter 1 to convert Fahrenheit to Celsius\n" +
                "Enter 2 to convert Celsius to Fahrenheit.");
        int num=in.nextInt();

        if(num==1)
        {
            System.out.println("Enter the temperature degree in Fahrenheit: ");
            double fah=in.nextDouble();
            System.out.println("The Temperature in Celsius is: "+ (fah-32)*5/9);
        }
        if(num==2)
        {
            System.out.println("Enter the temperature degree in Celsius: ");
            double cel=in.nextDouble();
            System.out.println("The Temperature in Fahrenheit is: " +(9*cel/5)+32);
        }
    }
}
