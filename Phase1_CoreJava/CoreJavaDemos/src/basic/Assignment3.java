package basic;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		/*
		Design for insurance system where insurance is provided based on following parameters . 
		If person is married he/she is insured
		If person is unmarried and female with age 25 and above is insured.
		If person is unmarried and male with age 30 and above is insured.
		WAP to take input gender, age and marital status as input. Find  whether person is insured or not.
		 */
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter your gender - Male (M) or Female (F)");
		char gender =sc.next().charAt(0);
		System.out.println("Please enter your marital status - Married (M) or Unmarried (U)");
		char marital_status =sc.next().charAt(0);
		System.out.println("Please enter your age :");
		int age = sc.nextInt();
		
		if(marital_status=='M')
			System.out.println("You are imsured");
		else if(marital_status=='U')
			if((gender=='F'&& age>25)||(gender=='M'&& age>30))
				System.out.println("You are insured");
			else
				System.out.println("You are not insured");
				
			
		
	}
}
