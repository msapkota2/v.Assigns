package inMainOnly;
import java.util.Scanner;

public class a13simpleWhile
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("This program continues to prompt the number until it gets a negative input.");
        int num;
        boolean flag=true;
        while(flag) {
            System.out.println("Enter the number: ");
            num=in.nextInt();
            if(num<0)
            {
                flag=false;
            }
        }

    }
}
