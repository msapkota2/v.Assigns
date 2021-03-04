package arrayUse;

import java.util.Scanner;

public class a35secLarNum
{
    public static void getSecondLargest(int[] arr, int size)
    {
        int temp;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(arr[size-2]);
    }
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int size;
        System.out.print("Enter the size of an array: ");
        size=in.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("The Second largest number in a given array: ");
        getSecondLargest(arr,size);

    }
}
