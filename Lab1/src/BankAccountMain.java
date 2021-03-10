import java.util.Scanner;

public class BankAccountMain
{
    public static void main(String[] args)
    {
        String name;
        String accN;
        double depositA;
        double withdrawA;
        double initialB;
        Scanner input=new Scanner(System.in);

        System.out.println("=====Welcome to sample prototype of a Bank Account====\n");
        System.out.println("Let's open a bank account");
        System.out.println("Enter the name: ");
        name= input.nextLine();
        System.out.println("Enter the Account Number: ");
        accN=input.nextLine();
        System.out.println("Do you want to add some amount Today(y/n): ");
        char ch=input.next().charAt(0);
        if(ch=='y'||ch=='Y')
        {
            System.out.println("Amount: ");
            initialB=input.nextDouble();
        }
        else
        {
            initialB= 0;
        }
        BankAccount Test=new BankAccount(name,accN,initialB);
        System.out.println("Would you like to deposit or withdraw: " +
                "\n1.Deposit" +
                "\n2.Withdraw" +
                "\n3.Leave at it is." +
                "\n4.Exit");
        int choice=input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the deposit Amount: ");
                depositA=input.nextDouble();
                if(depositA>50)
                {
                    Test.depositF(depositA, 0.02*depositA);
                }
                else {
                    Test.depositF(depositA);
                }
                Test.displayInfo();
                break;
            case 2:
                System.out.println("Enter the withdraw Amount: ");
                withdrawA=input.nextDouble();
                if(withdrawA>50)
                {
                    Test.withdrawF(withdrawA,0.05*withdrawA);
                }
                else {
                    Test.withdrawF(withdrawA);
                }
                Test.displayInfo();
                break;
            case 3:
                Test.displayInfo();
                break;
            case 4:
                System.out.println("\nThanks for being a loyal customer. Have a great day.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}
