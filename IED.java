import java.util.*;
import java.lang.*;
import java.io.*;

class IED
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int A=sc.nextInt();
	    int B=sc.nextInt();
	    int C=sc.nextInt();
	    int Asale=A*C;
	    int Bsale=B*C;
	    if(Asale>Bsale)
	    System.out.println(Asale);
	    else
	    System.out.println(Bsale);

	}
}
