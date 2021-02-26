package inMainOnly;

import java.util.Locale;
import java.util.Scanner;

public class a12DisplayFormat
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     //   Scanner input=new Scanner(System.in);
        int roll;
        String name,nationality;
        System.out.print("Enter the roll: ");
        roll=in.nextInt();
        System.out.print("Enter the name: ");
        name=in.next();
        System.out.print("Enter the nationality:");
        nationality=in.next();
        System.out.println("========================================");
        System.out.println("Roll         : "+roll);
        System.out.println("Name         : "+name.toUpperCase(Locale.ROOT));
        System.out.println("Nationality  : "+nationality.toUpperCase());
    }
}
