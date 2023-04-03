package gu.ac.it;

import java.util.Scanner;

public class Array3D {
	public static void main(String args[])    
    {  
    int i, j,k,size1,size2,size3;  
    System.out.println("Enter size of array: ");  
    Scanner s = new Scanner(System.in);  
    size1 = s.nextInt();  
    size2 = s.nextInt();
    size3 = s.nextInt();
    int arr[][][] = new int[size1][size2][size3];  
    System.out.println("Enter matrix:");  
    for( i=0; i < arr.length; i++){
        for( j=0; j < arr[i].length; j++){
           for( k=0; k < arr[i][j].length; k++){
        	   arr[i][j][k] = s.nextInt();  
               System.out.print(" ");  
           }
        }
      }
      
    System.out.println("The 3D matrix : ");  
    for( i=0; i < arr.length; i++){
        for( j=0; j < arr[i].length; j++){
           for( k=0; k < arr[i][j].length; k++){
              System.out.print( arr[i][j][k] + " ");
           }
           System.out.println(); 
        }
        System.out.println(); 
      }
    }
}
