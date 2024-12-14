import java.util.*;
class SWEETSHOP
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int z=x-(n*10);
		int i=z/20;
        System.out.println(i);
	}
}