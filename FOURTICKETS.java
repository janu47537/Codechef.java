import java.util.*;
import java.lang.*;
import java.io.*;

class FOURTICKETS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		while(t!=0)
		{
		    int x=sc.nextInt();
		    int v=x*4;
		    System.out.println((v<=1000)?"YES":"NO");
		    t--;
		}

	}
}
