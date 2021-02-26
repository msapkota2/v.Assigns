package inMainOnly;

import java.util.Scanner;

public class a17LeapYear
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Enter the year:");
        year = scan.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}

