package arrayUse;

import java.util.Scanner;

public class a32sumArr
{
    static double sum(double[] arr)
    {
        double summation=0;
            for(int i=0;i<arr.length;i++)
            {
                summation+=arr[i];
            }

        return summation;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size;
        System.out.print("Enter the size of an array: ");
        size=input.nextInt();
        double arr[]=new double[size];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextDouble();
        }

        double sum=sum(arr);
        System.out.println("The sum of the elements is: "+sum);
    }
}
