import java.util.*;
import java.lang.*;
import java.io.*;

class Draculaeats
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N=sc.nextInt();
		    N=N-1;
		    System.out.println((int)Math.ceil((float)N/7));
		}
	}
}
