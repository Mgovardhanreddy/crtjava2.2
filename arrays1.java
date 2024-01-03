import java.util.*;
class Arrays1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,a[];
        a=new int[5];
        System.out.println("enter 5 elements");
        for (i=0;i<5;i++)
        {
           a[i]=s.nextInt();
        }
        System.out.println("the values are");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]+"");
        }
    }
}