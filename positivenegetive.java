import java.util.*;
public class positivenegitive
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a;
		System.out.println("enter  a number");
		a=s.nextInt();
		if(a>0)
		{
		    if(a>0)
		    {
		    System.out.println(a+" is positive");
		   }
		   else
		   {
		       System.out.println(a+" is negetive");
		   }
    	}
    	else
    	if(a<0)
    	{
    	    System.out.println(a+" is negetive");
    	}
	     else
	     {
		   System.out.println(a+" is zero");
	     }
	}
}