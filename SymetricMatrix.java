import java.util.*;
class SymetricMatrix{
         public static void main(String[]args)
		 {
		    int [][]a= new int [5][5];
			int row,col,i,j,count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the order of the matrix");
			 row=sc.nextInt();
			 col=sc.nextInt();
			System.out.println("Enter the element of the matrix");
			for(i=0;i<row;i++)
			{ 
			   for(j=0;j<col;j++)
			     a[i][j]=sc.nextInt();
			}
			for(i=0;i<row;i++)
			{
			    for(j=0;j<col;j++)
				{
				   if(a[i][j]==a[j][i])
				   count++;
				 }
			}
			if(count==row*col)
			System.out.println("Matrix is Symetric");
			else
			System.out.println("Matrix is not Symetric");
		}
	}	