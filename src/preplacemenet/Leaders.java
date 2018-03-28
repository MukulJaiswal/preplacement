
package preplacemenet;

import java.util.Scanner;

public class Leaders
{
        public static void main(String[] args) 
        {
         Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of Array :");
        int n= sc.nextInt();
        int a[]= new int [n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int flag=1;
        for(int i=0;i<n;i++)
        {
            int num = a[i];
            for(int j=i;j<n;j++)
            {
                if(num<a[j])
                {
                    flag=0;
                    break;
                }
                
            }
            if(flag==1)
                System.out.println(a[i]+" ");
            
            flag=1;
        }
       }
}
