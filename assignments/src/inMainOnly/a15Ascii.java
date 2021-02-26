package inMainOnly;

import java.util.Scanner;

public class a15Ascii
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter the ASCII code between 0 and 128");
        int code=in.nextInt();
        System.out.println("The code "+code+" character is "+ (char)code+".");
    }
}
