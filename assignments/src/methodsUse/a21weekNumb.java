package methodsUse;

import java.util.Scanner;

public class a21weekNumb
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 7: ");
        int day = in.nextInt();
        System.out.println(name(day));
    }

    public static String name(int day)
    {
        String name;
        switch (day) {
            case 1: name = "Monday";
            break;
            case 2: name = "Tuesday";
            break;
            case 3: name = "Wednesday";
            break;
            case 4: name = "Thursday";
            break;
            case 5: name = "Friday";
            break;
            case 6: name = "Saturday";
            break;
            case 7: name = "Sunday";
            break;
            default:name = "Invalid Input";
        }
        return name;
    }
}
