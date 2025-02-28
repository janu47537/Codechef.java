import java.util.*;
import java.lang.*;
import java.io.*;

class Waterpark
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int W=sc.nextInt();
	    int H=sc.nextInt();
	    int chefweight=60;
	    int chefheight=130;
	    if(chefweight<=W && chefheight>=H)
	    {
	        System.out.println("YES");
	    }
	    else
	    {
	        System.out.println("NO");
	    }
	

	}
}
