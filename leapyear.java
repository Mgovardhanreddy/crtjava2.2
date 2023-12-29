import java.util.*;
public class leapyear
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int y;
		System.out.println("enter  a number");
		y=s.nextInt();
		if(y%4==0&&y%100==0||y%400==0)
		{
		    System.out.println("leap year");
		   }
		   else
		   {
		       System.out.println("not a leap year");
		   }
    	}
}