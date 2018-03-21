			/***********************************************************************	
										Guriqbal Singh 
										  Program #1
									Due: January 26, 2017
						This program will classify numbers being either deficient, perfect, 
						or abundant. It will contain multiple methods in order to keep the 
						program in an organized manner.
			***********************************************************************/

import java.util.*;
public class program_1
{
 		public static void main(String[] args)
 		{
 		//spacing 
 		System.out.println();
 		
 		//find the smallest ODD abundant number 
 		System.out.println("The smallest odd abundant number is: ");
 		
 		//call a function that finds the smallest abundant number 
 		smallestOdd();
 		
 		//spacing 
 		System.out.println();
 		
 		// call method to check and classify numbers from 20-30
 		TwentytoThirty();
 		
 		//spacing 
 		System.out.println();
 		
 		//call method to check and classify numbers from 490-500,
 		FourHundred();
 		
 		//spacing 
 		System.out.println();
 		
 	    //call method to check and classify numbers from 8120-8130,
		Thousands();
 		} 		
/*****************************************************************************************
	 	This method will find the smallest abundant number that is odd and then output the 
	 								the smallest abundant number 		*/
		public static void smallestOdd()
	 	{
	 	int[] min = new int[10000000];
		int factorSum; 		//declare variable
    	int count=0;
    	int sum=0,total=0;
    	
   		for(int i=0;i<min.length;i++)		
  		{
  		
  	    factorSum=0;		//initialize the sum to 0
  	    			
   		for(int j=1; j<i; j++)		
  	    {
   		if(i % j == 0 ) 		
  	    {
        factorSum += j;
        } 
        }
   
 	    if(factorSum > i)
        {
        if(i%2!=0)						//find the odd number 
        {
        System.out.println((i)); 		//display the smallest abundant number and then break;
        break;
        }
        }
        } 
	 	
	 	}							 		


/*****************************************************************************************
		This method will classify perfect, abundant, and deficient numbers for numbers
								that range from 20-30 	*/
public static void TwentytoThirty()
{
   int factorSum; 		//declare variable
   
   for(int i=20;i<=30;i++)		
   {
   factorSum=0;			//initialize the sum to 0
   for(int j=1; j<i; j++)		
   {
   if(i % j == 0 ) 		
   {
    factorSum += j;
   } 
   }
   
   if(factorSum > i)
   {
   System.out.println(i+" is abundant"); 		//declare abundant
   }
   		
   else if(factorSum < i)
   {
   System.out.println(i+" is deficient");		//declare deficient
   }
   
   else 
   {
   System.out.println(i+" is perfect");			//declare perfect 
   }
   }
}
/*********************************************************************************************
		This method will classify perfect, abundant and deficient numbers for numbers that 
									range from 490-500	*/
public static void FourHundred()
{
   int factorSum; 		//declare variable
   
   for(int i=490;i<=500;i++)		
   {
   factorSum=0;			//initialize the sum to 0
   for(int j=1; j<i; j++)		
   {
   if(i % j == 0 ) 		
   {
    factorSum += j;
   } 
   }
   
   if(factorSum > i)
   {
   System.out.println(i+" is abundant"); 
   }
   
   else if(factorSum < i)
   {
   System.out.println(i+" is deficient");
   }
   
   else 
   {
   System.out.println(i+" is perfect");
   }
   }
}		

/*********************************************************************************************
		This method will classify perfect, abundant and deficient numbers for numbers that
									range from 8120-8130 	*/
public static void Thousands()
{
   int factorSum; 		//declare variable
   
   for(int i=8120;i<=8130;i++)		
   {
   factorSum=0;			//initialize the sum to 0
   for(int j=1; j<i; j++)		
   {
   if(i % j == 0 ) 		
   {
    factorSum += j;
   } 
   }
   
   if(factorSum > i)
   {
   System.out.println(i+" is abundant"); 
   }
   
   else if(factorSum < i)
   {
   System.out.println(i+" is deficient");
   }
   
   else 
   {
   System.out.println(i+" is perfect");
   }
   }
}									 							
}
