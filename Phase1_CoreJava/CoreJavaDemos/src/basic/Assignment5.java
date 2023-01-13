package basic;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		password verification
		can create a variable to temporary store the right password
		1234
		ask the user to enter the password to log in
		1233
		stop the program either the password entered is correct
		or the no of tries are over
	 */
		
		int pwd=1234;
		int noofattempts =3;
		Scanner sc= new Scanner (System.in);
		while (noofattempts!=0)
		{
			System.out.println("Enter password ");
			if(pwd==sc.nextInt())
			{
				System.out.println("Password matched"); 
				break;
			}
			else
				System.out.println("Incorrect Password.No of attempts left :"+ --noofattempts+"\n"); 
			
			;
		}
		if(noofattempts==0)
			System.out.println("\n Account Locked");

	}

}
