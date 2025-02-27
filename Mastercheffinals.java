import java.util.*;
import java.lang.*;
import java.io.*;

class Mastercheffinals
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0) {
		    int n = sc.nextInt();
		    
		    if(n > 10) {
		        System.out.println("NO");
		    }
		    else {
		        System.out.println("YES");
		    }
		}
	}
}