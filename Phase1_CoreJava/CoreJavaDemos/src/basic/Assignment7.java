package basic;

import java.util.Scanner;

public class Assignment7 {
public static void main(String[] args) {
	
	/**
	 * Create an array to store 5 telephone numbers and 
	 * ask the user to enter their tel no
	 * Print Number found if it exists in the array
	 * else print not found
	 */
	
	long tel[] = {123456,234567,345678,456789,567890};
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter telephone no :");
	long temp=sc.nextLong();
	for(int i=0;i<tel.length;i++)
	{
		if(tel[i]==temp)
		{
			System.out.println("Number found");
			break;
		}
		if(i==(tel.length-1))
		{
			System.out.println("Not found");
		}
	}
	
}
}
