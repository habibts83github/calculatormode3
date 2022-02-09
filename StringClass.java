

package string;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myscanner = new Scanner(System.in);
		 
		 int count = 0,i=0;    
	        System.out.print("Please Enter a String to Count Characters :  ");
			String str = myscanner.nextLine();
			//Use a while loop to calculate the total characters in the string
			while(i < str.length())
			{
				if(str.charAt(i) != ' ') 
				{
					count++;
				}
				i++;
			}		
			System.out.println("\nThe Total Number of Characters  :  " + count);        
	    }      
	}
