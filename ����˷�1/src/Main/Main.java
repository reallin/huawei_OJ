package Main;


	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int line1=sc.nextInt();
			int linerow = sc.nextInt();
			int row2 = sc.nextInt();
			int[][] a = new int[line1][linerow];
			int[][] b = new int[linerow][row2];
			int[][] res = new int[line1][row2];
			for(int i=0;i<line1;i++)
			{
				for(int j=0;j<linerow;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<linerow;i++)
			{
				for(int j=0;j<row2;j++)
				{
					b[i][j] = sc.nextInt();
				}
			}
			matrix_multiply(a,b,res,line1, linerow,row2);
			sc.close();
		}
		public static void matrix_multiply(int[][]a,int[][]b,int[][]res,int line1, int linerow, int row2)
		{
			int sum = 0;
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<line1;j++)
				{
					 for(int k=0;k<b.length;k++)
					 {

					     sum+=a[i][k]*b[k][j];

					 }
					 res[i][j] = sum;
					 
					 sum = 0;
				}

				
			}
			for(int i=0;i<line1;i++)
			{
				for(int j=0;j<row2;j++)
				{
					if(j==row2-1)
						System.out.print(res[i][j]);
					else{
						System.out.print(res[i][j]+" ");
					}
					
				}
				System.out.print("\n");
			}
		}

	}

