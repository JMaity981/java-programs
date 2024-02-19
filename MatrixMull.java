import java.util.*;
class MatrixMull{
        public static void main(String[]args)
		{
		    int [][]a=new int [5][5];
			int [][]b=new int [5][5];
			int [][]c=new int [5][5];
			int arow,acol,brow,bcol,i,j,k;
			System.out.println("Enter the order of first matrix");
			Scanner sc =new Scanner(System.in);
            arow=sc.nextInt();
            acol=sc.nextInt();
            System.out.println("Enter the order of the second matrix");
            brow=sc.nextInt();
            bcol=sc.nextInt();
            if(acol==brow)	
            { 
               System.out.println("Enter the first matrix element");
               for(i=0;i<arow;i++)
                {
                   for(j=0;j<acol;j++)
                    { 
                       a[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Enter the second matrix element");
                for(i=0;i<brow;i++)
                {
                   for(j=0;j<bcol;j++)
                    { 
                        b[i][j]=sc.nextInt();
                    }
                }
				for(i=0;i<arow;i++)
				{
				   for(j=0;j<bcol;j++)
				   {
				       c[i][j]=0;
                       for(k=0;k<acol;k++)
					   c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
				}
				System.out.println("The reultan Matrix is:");
				for(i=0;i<arow;i++)
				{
				   for(j=0;j<bcol;j++)
				   { 
				       System.out.print("\t"+c[i][j]);
					}
					System.out.println();
				}
			}
		    else
			System.out.println("Multiplication is not possible");
		}
	}	