/* 2. Print below start pattern
	*             *
   	   *       *
               *
    	   *       *
         *               *

*/


import java.io.*;
import java.lang.*;


public class Star {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        
        PrintPattern.pattern(num);        
    }
}

class PrintPattern
{ 
      public static void pattern(int n)
    {
       for(int i=0; i<n ;i++)
        {
            int j = n-1-i;
            for(int k=0; k<n ;k++)
            {
                if(k==i || k==j)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" "); 
            }
             System.out.println();
        }
    }
}
