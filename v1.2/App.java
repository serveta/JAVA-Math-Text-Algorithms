import java.util.Scanner;
import algorithm.Math;
import algorithm.Text;


public class App {

	public static void main(String[] args) {
		
		int totalQuestion = 0;
		String answer;
		int answerInt = 0;
		Scanner scan = new Scanner(System.in);
		MainQuestion mainQuestion = new MainQuestion(2);
		MathQuestion mathQuestion = new MathQuestion(1);
		TextQuestion textQuestion = new TextQuestion(1);
		
		mainQuestion.newQuestion("What is your name?\n Answer: ", 1);
		mainQuestion.newQuestion("\n**MAIN MANU**\n1-Math\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ", 2);
		
		mathQuestion.newQuestion("\n**MATH MENU**\n1-Calculator\n2-Area Calculation\n3-Perimeter Calculation\n0-Back\n01-Main Menu\n0*-Close \n Answer: ", 3);
	
		textQuestion.newQuestion("\n**TEXT MENU**\n1-Text-1\n2-Text-2\n0-Back\n01-Main Menu\n0*-Close \n Answer: ", 2);
		
		totalQuestion = mainQuestion.length + mathQuestion.length + textQuestion.length;
		

		System.out.println("Welcome!");
		for (int i = 0; i < totalQuestion; i++) {
		
			if(i < mainQuestion.length) {
				mainQuestion.getQuestion(i);
			}
			else if(mainQuestion.getAnswer(1) != null && i >= mainQuestion.length) {
				
				if(mainQuestion.getAnswer(1).equals("1")) {
					if(i == mainQuestion.length) {
						mathQuestion.getQuestion(0);
					}
					else if(i > mainQuestion.length) {
						
						if(mathQuestion.getAnswer(0) == 1) {
							Math.Calculator();
							i-=2;
							continue;
						}
						else if(mathQuestion.getAnswer(0) == 2) {
							Math.AreaCalculator();
							i-=2;
							continue;
						}
						else if(mathQuestion.getAnswer(0) == 3) {
							Math.PerimeterCalculator();
							i-=2;
							continue;
						}
						else {
							System.out.print("You can choose only;");
							i-=2;
							continue;
						}
						
					}
					else {
						System.out.print("ERROR: i > mainQuestion...");
					}
					
					
				}
				else if(mainQuestion.getAnswer(1).equals("2")) {
					
					if(i == mainQuestion.length) {
						textQuestion.getQuestion(0);
					}
					else if(i > mainQuestion.length) {
						if(textQuestion.getAnswer(0).equals("1")) {
							Text.TextOne();
						}
						else if(textQuestion.getAnswer(0).equals("2")) {
							Text.TextTwo();
						}
						else {
							System.out.print("You can choose only;");
							i-=2;
							continue;
						}
						
					}
					else {
						System.out.print("ERROR: i > mainQuestion...");
					}
					
				}
				else {
					System.out.print("You can choose only;");
					i-=2;
					continue;
				}
				
			}
			else {
				System.out.print("Questions done!");
			}
			
			answer = scan.nextLine();
			
			if(answer.equals("0")) {
				if(i==0) {
					i=-1;
					continue;
				}
				else {
					i-=2;
					continue;
				}
			}
			if(answer.equals("01")) {
				if(i==0) {
					mainQuestion.answer(i, "ZerOne");
					continue;
				}
				i=0;
				continue;
			}
			if(answer.equals("0*")) {
				break;
			}
			
			if(i < mainQuestion.length) {
				mainQuestion.answer(i, answer);
			}
			else if(i == mainQuestion.length) {
				if(mainQuestion.getAnswer(1).equals("1")) {
					answerInt = StringToInt(answer);
					mathQuestion.answer(0, answerInt);	
				}
				if(mainQuestion.getAnswer(1).equals("2")) {
					textQuestion.answer(0, answer);
				}
			}
			else {
				System.out.print("ERROR: Answer save...");
			}
			
		}
		
		System.out.println("\nThe program has been terminated! " + mainQuestion.getAnswer(0));
		
		
	}

		
	public static int StringToInt(String value) {
		try{
            int number = Integer.parseInt(value);
            return number;
        }
        catch (NumberFormatException ex){
            return 00000000000;
        }
	}
}

// Version: 1.2.1
/*
 * The algorithm structure was reconsidered and redesigned.
 * Created an abstract class for different Question classes.
 * Created an algorithm package to store the algorithms.
 */

