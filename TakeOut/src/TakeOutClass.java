public class TakeOutClass
{
    public static void displayMainMenu()
    {
        System.out.println("Choose Type Of Meal: " +
                "\n1. Italian" +
                "\n2. Chinese" +
                "\n3. American");
    }
    public static void displayItalianFoodMenu()
    {
        System.out.println("Choose One:" +
                "\n1. Lasagna Tray - Feeds 5-17.99" +
                "\n2. Pizza Pack - Feeds 7-15.99" +
                "\n3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
    }
    public static void displayChineseFoodMenu()
    {
        System.out.println("Choose One:" +
                "\n1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls)- feeds 7-18.99" +
                "\n2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99" +
                "\n3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");

    }
    public static void displayAmericanFoodMenu()
    {
        System.out.println("Choose One:" +
                "\n1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99" +
                "\n2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\n" +
                "22.99" +
                "\n3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");

    }
    public static int determineTrays(int people, int feeds)
    {
        int trays;
        trays = (int) Math.ceil(people/feeds)+1;
        System.out.println("You need "+ trays+ " tray(s)");
        System.out.println("Feeds: "+ feeds);
        return trays;
    }
    public static double getSubtotal(double price, int trays)
    {
        return price * trays;
    }
    public static double getTax(double subtotal, double taxrate)
    {
        return subtotal * taxrate;

    }
    public static double getTip(double subtotal, double tipRate)
    {
        return subtotal * tipRate;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip)
    {
        return subtotal + tax + tip;
    }
    public static double pricePerPerson(double grandTotal, int people)
    {
        return grandTotal/people;
    }
    public static int determineLeftOvers(int feeds, int trays, int people)
    {
        return trays * feeds - people;
    }

}
