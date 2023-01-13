package basic;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Take input how many customers and for each customer ask for how many bills 
		 * and the customer name. 
		 * Print customer name and total of all the bills 
		 * for that customer
		 * 
		 * Output:
		 * How many customers : 3
		 * enter name of customer 1 : Shalini
		 * how many bills for customer 1 : 2
		 * enter amt for bill 1 : 100
		 * enter amt for bill 2 : 200
		 * 
		 * Shalini has to pay total 300/-
		 * 
		 * enter name of customer 2 : Shalini
		 * how many bills for customer 2 : 2
		 * enter amt for bill 1 : 100
		 * enter amt for bill 2 : 200
		 * 
		 * Shalini has to pay total 300/-
		 * 
		 * 
		 */
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the no of customers :");
		int noofcust=sc.nextInt();
		for(int i=1;i<=noofcust;i++)
		{
			System.out.println("Please enter the name of customer "+i);
			String name= sc.next();
			System.out.println("Enter the no of bills for "+name);
			int noofbills=sc.nextInt();
			int amt=0;
			for(int j=1;j<=noofbills;j++)
			{
				System.out.println("Enter amount for Bill "+j);
				int temp=sc.nextInt();
				amt+=temp;
			}
			System.out.println(name+" has to pay "+amt);
			
		}
		

	}

}
