package methodsUse;

import java.util.*;

public class a25highestScore
{
    public static void main(String[] args)
    {
            //use try catch
        try {
            //scanner
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int num = in.nextInt();
                //same number for names and scores
            String[] names = new String[num];
            double[] scores = new double[num];
            int nameIndex=0;
            double highScore=scores[0];
                //for loop to store values in to the array
            for (int i = 0; i < num; i++)
            {

                System.out.print("Enter the student " + (i+1) + " name: ");
                names[i] = in.next();
                System.out.print("Enter the student " + (i+1) + " score: ");
                scores[i] = in.nextDouble();
            }
                //for loop to get the highest score
            for (int i = 0; i < num; i++)
            {
                if(highScore<scores[i])
                {
                    highScore=scores[i];
                    nameIndex=i;
                }
            }
                //output
            System.out.println("\nStudent with Highest Score!");
            System.out.println("Student Name: "+names[nameIndex]);
            System.out.println("Score: "+scores[nameIndex]);
        }
        catch (Exception e)
        {
            System.err.println("Invalid Input");
        }

    }

}
