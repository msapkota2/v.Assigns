package restAssigns;

import java.io.*;   //File, iOException, and PrintStream
import java.util.*;

public class a44insertAndSearch
{
    public static void main(String args[]) throws IOException
    {
        Scanner in  =  new Scanner(System.in);
        System.out.print("Enter the Number of Students to store their data:");
        int n = in.nextInt();
        a44insertAndSearch std = new a44insertAndSearch();
        std.insertInfo(n);
        PrintStream output = new PrintStream(new File("StudentDetails.txt"));
        output.println("Student Name"+"\t\t"+"Address");
        output.println("======================================");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                output.print(std.name[i][j]+"\t\t");
            }
            output.println("\n======================================");
        }
        output.close();
        System.out.println("Your file is successfully updated.");
        System.out.println("Would you like to search the address by given name (y/n)?");
        char choice = in.next().charAt(0);
        if(choice=='y'|| choice=='Y')
        {
            std.searchInfo();
        }
        else
        {
            System.out.println("Have a great day!");
            System.exit(0);
        }
    }
    public String name[][] = new String[10][10];
    void insertInfo(int n) {
        Scanner get = new Scanner(System.in);
        int limit = n;
        System.out.println("Enter " + limit + " Student Details\n");

        for (int i = 0; i < limit; i++) {
            System.out.println("Enter Student #" + (i + 1) + " Name and Address:");
            for (int j = 0; j < 2; j++) {
                name[i][j] = get.nextLine();
            }
        }
    }
    void searchInfo()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the full name of the student: ");
        String Sname= input.nextLine();
        File file = new File("StudentDetails.txt");
        try (FileReader reader = new FileReader(file);)
        {
            System.out.println("Not Completed");
            for(int i=0;i<10;i++)
            {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



