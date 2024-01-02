import java.util.*;
public class Primenumber
	public static void main(String[] args)
	{
	    int n,i,c=0;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    for(i=1;i<=10;i++)
	    {
	        if(n%i==0)
	        c=c+1;
	    }
	    System.out.println(c);
	    if(c==2)
		System.out.println(n+"is primenumber");
		else
		System.out.println(n+"is notprimenumber");
	    }
	}
