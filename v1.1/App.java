import java.util.LinkedList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] mainQuestion = new String[2];
		String[] just2Answer = new String[2];
		String[] mathAlgorithmQuestion = new String[5];
		String[] textAlgorithmQuestion = new String[5];
		
		
		
		mainQuestion[0] = "What is your name?\n Answer: ";
		mainQuestion[1] = "\n1-Math\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		mathAlgorithmQuestion[0] = "\n1-Calculator\n2-Area Calculation\n3-Perimeter Calculation\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		textAlgorithmQuestion[0] = "\n1-Text\n2-Text\n0-Back\n01-Main Menu\n0*-Close \n Answer: ";
		
		
		int totalQuestions = mainQuestion.length + mathAlgorithmQuestion.length + textAlgorithmQuestion.length;

		
		String answer;
		
		
		System.out.println("Welcome!\n");
		for (int i = 0; i < totalQuestions; i++) { // WARNING: The loop length has to be the right value.
			
			if(i==0 || i==1) {
				System.out.print(mainQuestion[i]);
			}
			
			answer = scan.nextLine();
	
			if(i==0 || i==1) {
				just2Answer[i]=answer;
			}
			
				
			if(answer.equals("0")) {
				if(i==0) {
					just2Answer[i]="Zero";
					continue;
				}
				if(i>2) {
					i=0;
				}
				else {
					i-=2;
				}
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
					
					if(i>=2) {
						// From here on the user will go to the MATH algorithms.
						if(answer.equals("1")) {
							Calculator();
						}
						
					}
					
					System.out.print(mathAlgorithmQuestion[0]);
					
				}
				else if(just2Answer[1].equals("2")) {
					
					if(i>=2) {
						// From here on the user will go to the TEXT algorithms.
					}
					
					System.out.print(textAlgorithmQuestion[0]);
					
				}
				else {
					System.out.println("\nYou can choose only;");
					i--;
				}
			}
			
		}
		
		System.out.println("\nThe program has been terminated! "+just2Answer[0]);
		
	}

	private static void Calculator() {
		
		System.out.println("*** Calculator Opened ***");
		
		Scanner scan = new Scanner(System.in);
		int a, b, ans = 0;
		String c, d="";
		
		System.out.print("Num-1: ");
		a = scan.nextInt(); // it needs control. What if it's not an integer value...
		System.out.print("Num-2: ");
		b = scan.nextInt(); // it needs control. What if it's not an integer value...
		
		for(int i=0;i<1;i++) {
			System.out.print("\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n Answer: ");
			c = scan.next();
		
			if(c.equals("1")) {
				ans = a+b;
				d = "+";
				break;
			}
			else if(c.equals("2")) {
				ans = a-b;
				d = "-";
				break;
			}
			else if(c.equals("3")) {
				ans = a*b;
				d = "x";
				break;
			}
			else if(c.equals("4")) {
				ans = a/b;
				d = "/";
				break;
			}
			else {
				System.out.println("\nYou can choose only;");
				i--;
			}
		
		}
		
		System.out.println(a+" "+d+" "+b+" = "+ans);
		
		PressEnterKeyToContinue();
		
	}

	private static void PressEnterKeyToContinue() {
		
		System.out.println("Press Enter key to continue...\n\n");
		
		try {
			System.in.read();
		}
		catch(Exception e){
			
		}
	}
}

// Version: 1.1.1
/*
 * The latest version; 
 * - created a way to go to the algorithms
 * - created algorithm of Calculator
 * - created pressEnterKeyToContinue method
 * - comment lines added
 */
