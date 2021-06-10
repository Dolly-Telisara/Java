//1. Write Function to Check if 2 Strings are Anagram of each other.  


import java.lang.*;
import java.io.*;

public class Anagram 
{
    public static void main(String args[]) throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       // String str1 = "listen";
        //String str2 = "silent";
        boolean result = false;

        System.out.println("Enter first string : ");
        String str1 = br.readLine();

        System.out.println("Enter Second string : ");
        String str2 = br.readLine();
       
        Check_Anagram obj = new Check_Anagram();
        result = obj.isAnagram(str1,str2);
        if(result)
        {
            System.out.println("Strings " +str1+ " and " +str2+ " are Anagram of each other.");
        }
        else
        {
            System.out.println("Strings " +str1+ " and " +str2+ " are NOT Anagram of each other.");
        }
    }
}

class Check_Anagram 
{
    public boolean isAnagram(String s1,String s2)
    {
        if(s1.length() != s2.length() )
        {
            return false;
        }
        
        int count = 0;
// Sum of characters of first string
        for(int i = 0; i < s1.length(); i++ )
        {
            count = count + s1.charAt(i);
            System.out.println("For s1  count is "  + count + " at " +i);
        }
// Subtract the value of all the chracters of second string
        for(int i = 0 ; i < s2.length() ; i++)
        {
            count = count - s2.charAt(i);
            System.out.println("For s2  count is "  + count + " at " +i);
        }
        if(count == 0)
        {
            return true;
        }
        return false;
    }
    
}
