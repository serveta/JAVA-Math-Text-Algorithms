import java.util.LinkedList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		LinkedList<String> answerList = new LinkedList<String>();
		
		String[] mainQuestion = new String[2];
		String[] just2Answer = new String[2];
		String[] mathAlgorithmQuestion = new String[5];
		String[] textAlgorithmQuestion = new String[5];
		
		
		
		mainQuestion[0] = "What is your name?\n Answer: ";
		mainQuestion[1] = "1-Math\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		mathAlgorithmQuestion[0] = "1-Math\n2-Math\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		textAlgorithmQuestion[0] = "1-Text\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		
		int totalQuestions = mainQuestion.length + mathAlgorithmQuestion.length + textAlgorithmQuestion.length;

		int i = -1;
		String answer;
		
		
		System.out.println("Welcome!\n");
		for (i = 0; i < totalQuestions; i++) {
			
			if(i==0 || i==1) {
				System.out.print(mainQuestion[i]);
			}
			
			answer = scan.nextLine();
	
			if(i==0 || i==1) {
				just2Answer[i]=answer;
			}
			
			answerList.add(i, answer);
			
				
			if(answer.equals("0")) {
				i-=2;
			}
			if(answer.equals("01")) {
				i=0;
				continue;
			}
			if(answer.equals("0*")) {
				break;
			}
			
			
			if(i>=1) {
				if(just2Answer[1].equals("1")) {
					
					System.out.print(mathAlgorithmQuestion[--i]);
					
					i++;
					
				}
				else if(just2Answer[1].equals("2")) {
					System.out.println("2222222");
				}
				else {
					System.out.println("You can choose only;");
					i--;
				}
			}
			
		}
		
		System.out.println("The program has been terminated!");
		
	}
}


// Version: 1.1
