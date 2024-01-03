
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
       int a[][],i,j,n,sum=0;
       System.out.println("enter no.of rows and columns");
       n=s.nextInt();
       a=new int[n][n];
       System.out.println("enter elemenets");  
       for(i=0;i<2;i++)
       {
           for(j=0;j<2;j++)
           {
               a[i][j]=s.nextInt();
           }
       }
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               if(i==j)
               sum=sum+a[i][j];
           }
       }
             System.out.print("sum of diagonal elements="+sum);  
      
    }
}