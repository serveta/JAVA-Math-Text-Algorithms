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
		mainQuestion[1] = "\n1-Math\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		mathAlgorithmQuestion[0] = "\n1-Math\n2-Math\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		textAlgorithmQuestion[0] = "\n1-Text\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		
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
				if(i==0) {
					just2Answer[i]="Zero";
					continue;
				}
				i-=2;
			}
			if(answer.equals("01")) {
				if(i==0) {
					just2Answer[i]="ZeroOne";
					continue;
				}
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
					System.out.print(textAlgorithmQuestion[--i]);
					i++;
				}
				else {
					System.out.println("\nYou can choose only;");
					i--;
				}
			}
			
		}
		
		System.out.println("\nThe program has been terminated! "+just2Answer[0]);
		
	}
}


// Version: 1.1.0
