import java.util.*;
import java.lang.*;
import java.io.*;

class CALINTAKE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int X=sc.nextInt();
	    int Y=sc.nextInt();
	    int Z=sc.nextInt();
	    int W=Y*Z;
		if(X<100 && Y<100 && Z<100)
		{
		if(W<X)
		System.out.println(X-W);
		else
		System.out.println("-1");
		}
		else
		System.out.println("0");

	}
}
