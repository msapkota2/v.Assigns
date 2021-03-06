package restAssigns;

import java.util.Scanner;

public class a38palin
{
    public boolean isPalindrome(String str)
    {
        StringBuilder reverse= new StringBuilder();
        for ( int i = str.length() - 1; i >= 0; i-- )
            reverse.append(str.charAt(i));

        return str.equals(reverse.toString());
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        a38palin palindrome=new a38palin();
        boolean flag=palindrome.isPalindrome(str);
        if(flag)
        {
            System.out.println(str+" is a palindrome.");
        }
        else
            System.out.println(str+" is not a palindrome.");
    }
}
