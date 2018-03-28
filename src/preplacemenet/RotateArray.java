
package preplacemenet;
import java.util.Scanner;
public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of Array :");
        int n= sc.nextInt();
        System.out.println("Enter the shift size :");
        int d= sc.nextInt();
        int a[]= new int [n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        
        for(int i=0;i<d;i++)
        {
            int temp = a[0];
            for(int j=0;j<n-1;j++)
            {
                a[j]= a[j+1];
            }
            a[n-1]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
   
}
