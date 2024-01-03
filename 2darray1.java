
class Main
	{
    public static void main(String[] args) {
       int a[][]={{3,8},{5,9}};
       int i,j;
       System.out.println("matrix is");
       for(i=0;i<2;i++)
       {
           for(j=0;j<2;j++)
           {
             System.out.print(a[i][j]+"");  
           }
           System.out.println();
       }
    }
}