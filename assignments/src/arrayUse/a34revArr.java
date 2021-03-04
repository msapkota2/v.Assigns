package arrayUse;

import java.util.*;

public class a34revArr
{
    static void reverse(int[] arr, int size) {
        int i,
                temp;
        for (i = 0; i < size / 2; i++)
        {
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;

        }
    }
    static void print(int[] arr)
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
        int arr[]=new int[size];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The original order: ");
        print(arr);
        System.out.println("The reverse order: ");
        reverse(arr,size);
        print(arr);
    }
}
