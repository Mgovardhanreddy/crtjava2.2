
import java.util.*;
class Arrays2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,a[],n;
        System.out.println("enter size of an array");
       n=s.nextInt();
       a=new int[n];
        System.out.println("enter n elements");
        for (i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }
        System.out.println("the values are");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+"");
        }
    }
}