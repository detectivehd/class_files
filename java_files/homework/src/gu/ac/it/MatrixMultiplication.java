package gu.ac.it;
import java.util.Scanner;
public class MatrixMultiplication {
	
		static void printMatrix(int M[][],
								int rowSize,
								int colSize)
		{
			for (int i = 0; i < rowSize; i++) {
				for (int j = 0; j < colSize; j++)
					System.out.print(M[i][j] + " ");

				System.out.println();
			}
		}

			static void multiplyMatrix(
			int row1, int col1, int A[][],
			int row2, int col2, int B[][])
		{
			int i, j, k;

			System.out.println("\nMatrix A:");
			printMatrix(A, row1, col1);
			System.out.println("\nMatrix B:");
			printMatrix(B, row2, col2);

			if (row2 != col1) {

				System.out.println(
					"\nMultiplication Not Possible");
				return;
			}

			int C[][] = new int[row1][col2];
			for (i = 0; i < row1; i++) {
				for (j = 0; j < col2; j++) {
					for (k = 0; k < row2; k++)
						C[i][j] += A[i][k] * B[k][j];
				}
			}

			System.out.println("\nResultant Matrix:");
			printMatrix(C, row1, col2);
		}

		public static void main(String[] args)
		{

			int i,j,row1 , col1, row2, col2;
			System.out.println("Enter total rows and columns of matrix A: ");  
		    Scanner s = new Scanner(System.in);  
		    row1 = s.nextInt();  
		    col1 = s.nextInt();
		    System.out.println("Enter total rows and columns of matrix B: ");  
		    row2 = s.nextInt();  
		    col2 = s.nextInt();

			int A[][] = new int[row1][col1];  
		    System.out.println("Enter matrix A:");  
		    for(i = 0; i < row1; i++)  
		    {  
		        for(j = 0; j < col1; j++)   
		            {  
		            A[i][j] = s.nextInt();  
		            System.out.print(" ");  
		            }  
		    }  
		    int B[][] = new int[row2][col2];  
		    System.out.println("\nEnter matrix B:");  
		    for(i = 0; i < row1; i++)  
		    {  
		        for(j = 0; j < col1; j++)   
		            {  
		            B[i][j] = s.nextInt();  
		            System.out.print(" ");  
		            }  
		    }  

			multiplyMatrix(row1, col1, A,
						row2, col2, B);
		}
	}


