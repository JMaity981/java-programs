import java.util.*;
class MatrixTranspose{
        public static void main(String[]args)
		{
		    int [][]a=new int [5][5];
			int row,col,i,j;
			System.out.println("Enter the order of first matrix");
			Scanner sc =new Scanner(System.in);
            row=sc.nextInt();
            col=sc.nextInt(); 
            System.out.println("Enter the first matrix element");
            for(i=0;i<row;i++)
            {
               for(j=0;j<col;j++)
               { 
                  a[i][j]=sc.nextInt();
               }
		    }
              System.out.println("The reultan Matrix is:");
             
            for(j=0;j<col;j++)
            {
                for(i=0;i<row;i++)
                { 
                    System.out.print("\t"+a[i][j]);
                }
			    System.out.println();
             }
        }
}		
			