
package preplacemenet;
import java.io.*;
import java.util.*;
public class StackLearn
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack= new Stack<Integer>();
        Stack stack1 = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
       
        stack.push(40);
        
        for(int i=0;i<stack.size();i++)
        {
            System.out.print(stack.get(i)+ " ");
        }
//        for(int i=0;i<stack.size();i++)
//        {
//            stack1.push(stack.get(i));
//        }
//          for(int i=0;i<stack1.size();i++)
//        {
//            stack.push(stack1.get(i));
//        }
//          for(int i=0;i<stack.size();i++)
//        {
//            System.out.print(stack.get(i)+ " ");
//        }
          Object s[]=stack.toArray();
          if((int)s[1]>(int)s[0])
          {
              System.out.println("true");
          } 

          
          for(int i=0;i<s.length;i++)
          {
              System.out.println(s[i]);
          }
          
          
        int m=stack.size();
        

       
    }
}
