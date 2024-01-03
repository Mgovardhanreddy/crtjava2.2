
import java.util.*;
class Array
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,a[],n,sno;
        System.out.println("enter size of an array");
       n=s.nextInt();
       a=new int[n];  
        System.out.println("enter n elements");
        for (i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }
         System.out.println("enter search elements ");
         sno=s.nextInt();
        int r=Arrays.binarySearch(a,sno);
          for (i=0;i<n;i++)
         {
           System.out.println(a[i]+"");  
         }
         System.out.println();
         Arrays.sort(a);
         System.out.println("enter elements after sorting");
          if(r<0)
          {
            System.out.println("search elements is not found");    
          }
          else
          {
            System.out.println("search elements is  found\n position="+(n+1));    
          }
    }