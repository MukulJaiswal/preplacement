
package preplacemenet;

import java.util.Scanner;

public class Preplacemenet
{
    public static void main(String[] args)
    {    
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       // System.out.println(Integer.MAX_VALUE);
       
        int m=0;
        int max=0,c=0,number=0;
        for(int i=0;i<n;i++)
        {
            m=a[i];
            for(int j=0;j<n;j++)
            {
                if(a[j]==m)
                {
                    c++;
                }
                if(c > max)
                {
                    max=c;
                    number = m;
                }
               
            }
             m=0;
                c=0;
            
        }
        System.out.println(number);
    }
    
}
