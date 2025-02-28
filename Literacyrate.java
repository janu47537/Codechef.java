import java.util.*;
import java.lang.*;
import java.io.*;

class Literacyrate
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int p = s.nextInt();
		    int l = s.nextInt();
		    double per = ((double)l/p) * 100;
		    
		    if(per >= 75){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
