class  

import java.util.*;
class Arrays3
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,a[],n,sum=0;
        float avg;
        System.out.println("enter size of an array");
       n=s.nextInt();
       a=new int[n];
        System.out.println("enter n elements");
        for (i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=(float)sum/n;
         System.out.println("sum of elements are="+sum);
        System.out.println("avg of elements are="+avg); 
    }
}