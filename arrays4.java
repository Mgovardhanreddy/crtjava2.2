
import java.util.*;
class Arrays4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,a[],n,big;
        float avg;
        System.out.println("enter size of an array");
       n=s.nextInt();
       a=new int[n];
        System.out.println("enter n elements");
        for (i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }
        big=a[0];
        for(i=0;i<n;i++)
        {
         if (big<a[i])
            big=a[i];
        }
         System.out.println("biggest of elements are="+big);
    }
}