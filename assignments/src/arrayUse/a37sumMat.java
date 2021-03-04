package arrayUse;

import java.util.Scanner;

public class a37sumMat
{
    public static void sum(int row, int col, int[][] arr1,int[][] arr2)
    {
        System.out.println("The sum of the Matrix: ");
        int[][]sum=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                sum[i][j]=arr1[i][j]+arr2[i][j];
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(sum[i][j]+"  ");
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter the row of the array: ");
        row=in.nextInt();
        System.out.print("Enter the col of the array: ");
        col=in.nextInt();
        int[][] arr1 =new int[row][col];
        int[][] arr2 =new int[row][col];
        System.out.println("Enter the values in the first array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            arr1[i][j]=in.nextInt();
        }
        System.out.println("Enter the values in the second array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                arr2[i][j]=in.nextInt();
        }

        sum(row, col, arr1,arr2);
    }
}
