import java.util.*;
public class Biggest
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a,b;
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
		    System.out.println(a+" a is biggest");
		}
		 else
		 {
		  System.out.println(b+"  b is biggest");
		 }
	}
}
