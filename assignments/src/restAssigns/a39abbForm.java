package restAssigns;
import java.util.Scanner;
public class a39abbForm
{
    static void shortForm(String str)
    {
        if (str.length() == 0)
            return;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch != ' ') {
                str1.append(ch);
            }
            else
                {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = new StringBuilder();
            }
        }
        for (int i = 0; i < str1.length(); i++)
        {
            if (i == 0)
                str2.append(Character.toUpperCase(str1.charAt(0)));
            else
                str2.append(Character.toLowerCase(str1.charAt(i)));
        }
        System.out.println(str2);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        shortForm(str);
    }
}
