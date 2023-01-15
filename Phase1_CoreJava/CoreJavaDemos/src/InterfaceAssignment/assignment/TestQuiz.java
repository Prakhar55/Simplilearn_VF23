package assignment;

import java.util.Scanner;

public class TestQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuizService service =new QuizService();
		System.out.println("Please select language from below 3:\n1.C\t2.HTML\t3.Java");
		Scanner sc =new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			CQuizMaster c = new CQuizMaster();
			System.out.println(service.askQuestion(c)) ;
			break;
		case 2:
			HTMLQuizMaster h =new HTMLQuizMaster();
			System.out.println(service.askQuestion(h));
			break;
		case 3:
			JavaQuizMaster j =new JavaQuizMaster();
			System.out.println(service.askQuestion(j));
			break;
		}
	}

}
