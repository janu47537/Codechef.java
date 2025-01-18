import java.util.*;
import java.lang.*;
import java.io.*;

class WAITINGTIME
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    while(n-->0)
	    {
	    int K=sc.nextInt();
	    int X=sc.nextInt();
	    int remainingdays=7*K-X;
	    System.out.println(remainingdays);
	    }
	    

		

	}
}
