import java.util.*;
public class Array2
{
    public static void main(String args[])
    {
        int r,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers of rows");
        r=sc.nextInt();
        System.out.println("Enter the numbers of Column");
        c=sc.nextInt();
                int arr[][]=new int[r][c];
                System.out.println("Enter the Array Elements : ");
                 for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                       arr[i][j]=sc.nextInt();
                    }

                   
                }
                System.out.println("Array eleemnts are : ");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            
    }
}