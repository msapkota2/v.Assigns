package inMainOnly;

import java.util.Scanner;

public class a4SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p,t,r;
        System.out.print("Enter the principal amount: ");
        p=in.nextFloat();
        System.out.print("Enter the month:");
        t = in.nextFloat();
        System.out.print("Enter the rate:");
        r = in.nextFloat();
        System.out.println("\nThe Simple Interest is " + (p*t*r) / 100);
    }
}