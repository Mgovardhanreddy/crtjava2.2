
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
       int a[][],i,j,m,n;
       System.out.println("enter no.of rows and columns");
       n=s.nextInt();
       m=s.nextInt();
       a=new int[m][n];
       System.out.println("enter elemenets");  
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
           {
               a[i][j]=s.nextInt();
           }
       }
       System.out.println("matrix is");
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
           {
            System.out.print(a[i][j]+" ");  
           }
         System.out.println(); 
       }
   System.out.println("transpose matrix is"); 
   for(i=0;i<m;i++)
   {
       for(j=0;i<n;j++)
       {
        System.out.print(a[i][j]+" ");
       }
       System.out.println();
    } 
   }
}