import java.util.*;
class MatrixAdd{
        public static void main(String[]args)
		{
		    int [][]a=new int [5][5];
			int [][]b=new int [5][5];
			int [][]c=new int [5][5];
			int arow,acol,brow,bcol,i,j;
			System.out.println("Enter the order of first matrix");
			Scanner sc =new Scanner(System.in);
            arow=sc.nextInt();
            acol=sc.nextInt();
            System.out.println("Enter the order of the second matrix");
            brow=sc.nextInt();
            bcol=sc.nextInt();
            if(arow==brow && acol==bcol)	
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
                   for(j=0;j<acol;j++)
                    { 
                      c[i][j]=a[i][j]+b[i][j];
                    }
                }			
				for(i=0;i<arow;i++)
                {
                   for(j=0;j<acol;j++)
                    { 
                       System.out.print("\t"+c[i][j]);
                    }
					System.out.println();
                }
			}
            else
              System.out.println("Addition is not possible");
        }
}		
			