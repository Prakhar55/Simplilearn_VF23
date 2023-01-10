package basic;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		/*
		 * leap year?
		 * 2000 => Y %4 and %100 and %400 
		 * 1996 => Y %4 and ! %100 
		 * 1900 => N %4 and %100 but !%400 NLY
		 * take year as input and print if it s LY or not
		 */
		System.out.println("Enter the year :");
		Scanner sc = new Scanner (System.in);
		int yr = sc.nextInt();
		
		String result = (yr%4==0)?((yr%100==0)?((yr%400==0)?"Leap Year":"Not a Leap Year"):"Leap Year"):"Not a Leap Year";
		System.out.println("Entered year is "+result);		
	}

}
