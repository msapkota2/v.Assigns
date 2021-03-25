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
        PrintStream output = new PrintStream(new File("./assignments/src/restAssigns/StudentDetails.txt"));
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
        //Scanner input=new Scanner(System.in);
        File file = new File("./assignments/src/restAssigns/StudentDetails.txt");
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader (fileReader);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the  name of the student: ");
            String nameConsole=br.readLine();
            //System.out.println(name);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                String nameFile=line.substring(0,line.indexOf("="));
                if(nameFile.equalsIgnoreCase(nameConsole.toLowerCase()))
                {
                    String address =line.substring(line.indexOf("=") + 1);
                    System.out.println(address);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}



