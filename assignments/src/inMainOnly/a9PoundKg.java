package inMainOnly;

import java.util.Scanner;

public class a9PoundKg
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number of Pounds: ");
        double num=in.nextInt();
        System.out.println("The value in Kg: "+(num*0.454)+" kg");

    }
}
