package arrayUse;

import java.util.Scanner;

public class a36findDup
{

    public static void Dup(String[] arr, int size) {
        System.out.println("The duplicate elements in the given array: ");

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j <size; j++) {
                if (arr[i].equals(arr[j]))
                    System.out.print(arr[j]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int size;
        System.out.print("Enter the size of an array: ");
        size=in.nextInt();
        String[] arr =new String[size];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.next();
        }

        Dup(arr,size);


    }
}
