import java.util.*;
import java.lang.*;
import java.io.*;

class LUCKYSEVEN
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    if(s.length()<11)
	    {
	    char result=s.charAt(6);
	    System.out.println(result);
	    }
	    else
	    {
	    System.out.println("not a 10 letter word");
	    }
	}
}