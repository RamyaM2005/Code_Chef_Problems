import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(a*c);
		int e=(b*c);
		if(d>e)
		System.out.println(d);
		else
		System.out.println(e);
	}
}
