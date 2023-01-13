package basic;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		/**
		 * WAP to take 5 numbers as input and print the 
		 * sum of all the even numbers entered by the user
		 */
		Scanner sc = new Scanner (System.in);
		int sum=0;
		for (int i=1;i<=5;i++)
		{
			System.out.println("Enter no. "+i);
			int temp=sc.nextInt();
			if(temp%2==0)
			sum+=temp;
		}
		System.out.println("Sum of even no.s is "+sum);
	}
}
