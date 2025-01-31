import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pendingassignments
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		while(t-->0)
		System.out.println(pending(s));
	}
	public static String pending(Scanner s)
	{
	    int x,y,z;
	    x=s.nextInt();
	    y=s.nextInt();
	    z=s.nextInt();
	    return (((x*y)<=(z*24*60))?"YES":"NO");
	}
}
