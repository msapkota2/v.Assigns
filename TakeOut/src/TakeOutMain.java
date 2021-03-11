import java.util.Scanner;

public class TakeOutMain
{
    public static void WorkingClass(int number, int feeds, double price)
    {
        double taxRate=0.07;
        double tipRate=0.15;

        int trays = TakeOutClass.determineTrays(number, feeds);
        double subTotal = TakeOutClass.getSubtotal(price, trays);
        System.out.println("Price for "+number+" people ("+trays+" trays):"+subTotal);
        double tax = TakeOutClass.getTax(subTotal, taxRate);
        System.out.printf("Tax: %.2f", tax);
        double tip = TakeOutClass.getTip(subTotal, tipRate);
        System.out.printf("%nTip: %.2f", tip);
        double grandTotal = TakeOutClass.getGrandTotal(subTotal, tax, tip);
        System.out.printf("%nTotal (food, tax, tip): %.2f", grandTotal);
        double pricePerPerson = TakeOutClass.pricePerPerson(grandTotal, number);
        System.out.printf("%nPrice per person: %.2f", pricePerPerson);
        int leftovers = TakeOutClass.determineLeftOvers(feeds, trays, number);
        System.out.println("\nLeftover servings for the delivery person:"+leftovers);

    }
    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of people to order: ");
        int number=in.nextInt();
        int choiceType = 0;
        if(number<=0 || number>20)
        {
            System.out.println("number of people are invalid");
        }
        else
        {
            TakeOutClass.displayMainMenu();
            choiceType=in.nextInt();
        }
        switch (choiceType)
        {
            case 1:
                TakeOutClass.displayItalianFoodMenu();
                int choiceItem=in.nextInt();
                switch(choiceItem)
                {
                    case 1:
                        WorkingClass(number,5,17.99);
                        break;
                    case 2:
                        WorkingClass(number,7,15.99);
                        break;
                    case 3:
                        WorkingClass(number,4,12.99);
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;
            case 2:
                TakeOutClass.displayChineseFoodMenu();
                int choiceItem2=in.nextInt();
                switch(choiceItem2)
                {
                    case 1:
                    case 2:
                        WorkingClass(number,7,18.99);
                        break;
                    case 3:
                        WorkingClass(number,5,10.99);
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;
            case 3:
                TakeOutClass.displayAmericanFoodMenu();
                int choiceItem3=in.nextInt();
                switch(choiceItem3)
                {
                    case 1:
                        WorkingClass(number,8,21.99);
                        break;
                    case 2:
                        WorkingClass(number,5,22.99);
                        break;
                    case 3:
                        WorkingClass(number,10,26.99);
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;
            default:
                System.out.println("Program Stops");
                break;
        }

    }
}
