package restAssigns;

import java.util.Scanner;

public class a40revStr2
{

    static void reverse(String str)
    {
        if (str.length() == 0)
            return;
        String reverse="";
        for (int i=str.length()-1;i>=0;i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=in.nextLine();
        System.out.println("\nThe reverse of the given string: ");
        reverse(str);
    }
}
