package restAssigns;

import java.util.Scanner;

public class a40revStr
{

    static void reverse(String str)
    {
        StringBuilder reverse=new StringBuilder(str);
        System.out.println(reverse.reverse());

    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=in.nextLine();
        System.out.println("The reverse of the given string: ");
        reverse(str);
    }
}
