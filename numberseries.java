import java.util.*;
public class Numberseries
{
	public static void main(String[] args)
	{
	    int i,n,n1=0;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    for(i=1;i<=10;i++)
	    {
	    System.out.println(n+"");
	    n|=n1+i;
	    }
	}
}
