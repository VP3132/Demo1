package JavaDemo;

import java.util.Scanner;

public class Assigment3 {

	public static void main(String[] args) {
		{
             int n=5;
	        
//             Q2
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n-i;j++)
	            {
	                System.out.print("  ");
	            }
	            for(int j=i;j>0;j--)
	            {
	                System.out.print(" "+j);
	            }
	            for(int j=2;j<=i;j++)
	            {
	                System.out.print(" "+j);
	            }
	            System.out.println();
	        }
	        
//	       Q1 
	        
	        for(int i=1;i<=4;i++)
	        {
	            for(int j=4;j>=i;j--)
	            {
	                System.out.print("  ");
	            }
	            for(int k=1;k<=i;k++)
	            {
	               
	            System.out.print(i);
	        
	            System.out.println();
	            
	            }
	        }
	        
		//Q7. Java Program to Find the Largest and Smallest Numbers From an Array of Random
//	        Numbers
	       
	        
	        int numbers[] = new int[]{1,2,3,5,6,7,8,9,10,11};

	      
	        int smallest = numbers[0];
	        int largetst = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	         if (numbers[i] > largetst)
	          largetst = numbers[i];
	         else if (numbers[i] < smallest)
	          smallest = numbers[i];
	        }

	        System.out.println("Largest Number is : " + largetst);
	        System.out.println("Smallest Number is : " + smallest);
	        
	        
	        
	        
	        
	        
		}
		
	
	      
	}

}

