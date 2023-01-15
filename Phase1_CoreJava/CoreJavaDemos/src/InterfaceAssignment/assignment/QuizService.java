package assignment;

public class QuizService {
	
	public static String askQuestion(Quizmaster qm) 
	{
		return qm.popQuestion();
	}

}
