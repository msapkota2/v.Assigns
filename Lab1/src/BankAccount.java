
public class BankAccount
{
    private String name;
    private String accNumber;
    private double balance;

    public BankAccount()
    {
        //default constructor
    }
    public BankAccount(String name,String accNum)
    {
        this.name=name;
        this.accNumber=accNum;
        this.balance=0.0;
    }
    public BankAccount(String name,String accNum,double balance)
    {
        this.name=name;
        this.accNumber=accNum;
        this.balance=balance;
    }
        //Overload the withdraw method
    public void withdrawF(double money)
    {
        if(money<0)
        {
            System.out.println("Get more money than 0!");
        }
        else if(this.balance<money)
        {
            System.out.println("You don't have enough balance to withdraw.");
        }
        else {

            this.balance-=money;
        }

    }
    public void withdrawF(double money, double fee)
    {
        if(money<0)
        {
            System.out.println("Get more money than 0!");
        }
        else if(this.balance<money)
        {
            System.out.println("You don't have enough balance to withdraw.");
        }
        else
            {

            this.balance-=money-fee;
        }

    }
    //Overload the deposit method
    public void depositF(double money)
    {
        if(money<0)
        {
            System.out.println("How can deposit negative?");
        }
        else
        {
            this.balance+=money;
        }
    }
    public void depositF(double money, double interest)
    {
        if(money<0)
        {
            System.out.println("How can deposit negative?");
        }
        else
        {
            this.balance+=money+interest;
        }
    }
    public void displayInfo()
    {
        System.out.println("\nYour Account so Far!");
        System.out.println("Name: "+this.name);
        System.out.println("Account Number: "+this.accNumber);
        System.out.println("Balance: "+this.balance);

    }


}
