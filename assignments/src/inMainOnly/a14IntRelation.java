package inMainOnly;
import java.util.Scanner;

public class a14IntRelation
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the First Integer: ");
        int a =in.nextInt();
        System.out.print("Enter the Second Integer: ");
        int b=in.nextInt();
        if(a==b)
            System.out.println("Both integers are same,");
        if(a>b)
            System.out.println("The First Integer is greater than Second Integer.");
        if(a<b)
            System.out.println("The First Integer is smaller than Second Integer.");

    }
}
