package arrayUse;

import java.util.Scanner;

public class a33ascOrd
{
    static void ascending(double[] arr)
    {
        double temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void print(double[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int size;
        System.out.print("Enter the size of an array: ");
        size=in.nextInt();
        double arr[]=new double[size];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextDouble();
        }
        System.out.println("The original order: ");
        print(arr);
        System.out.println("The ascending order: ");
        ascending(arr);
        print(arr);
    }
}
