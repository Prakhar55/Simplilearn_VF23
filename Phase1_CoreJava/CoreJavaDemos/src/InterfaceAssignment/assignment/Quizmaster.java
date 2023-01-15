/** * Create an interface QuizMster with public String popQuestion(); method * 
 * Create 3 classes(JavaQuizMaster, HTMLQuizMaster and CQuizMaster )that implements * QuizAmster interface 
 * and returns question specfic to that language * 
 * Create a class QuizService that has QuizMaster as a reference variable * and 
 * a method askQuestion that calls popQuestion of respective class based on * users choice * 
 * Create a class with main method that tests the above classed * * * @param args */
package assignment;

public interface Quizmaster {
	
	public String popQuestion();

}
