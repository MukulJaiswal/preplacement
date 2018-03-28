
package preplacemenet;

import java.util.Scanner;

public class Odd_Occurances 
{
    public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of Array :");
        int n= sc.nextInt();
        int a[]= new int [n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int count =0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int num= a[i];
            for(int j=0;j<n;j++)
            {
                if(num == a[j])
                    count++;
            }   
             if(count % 2!=0)
                max=count;
             count =0;
        }
        System.out.println(max);
       
    }
}
