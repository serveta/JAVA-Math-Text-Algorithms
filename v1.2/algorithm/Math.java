package algorithm;

import java.util.Scanner;

public class Math {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void Calculator() {
		System.out.println("\n\n***Caculator Opened***");
		int eq = 1;
		int answer = 0;
		int operation = 0;
		int operationMemory = 0;
		int memory = 0;
		int operationQueue = 0;
		int c = 0;
		
		for(int i = 0; i < eq; i++) {
			System.out.print(" Give me a number: ");
			answer = scan.nextInt();
			
			System.out.print("\n1-Addition (+)\n2-Subtraction (-)\n3-Multiplication (x)\n4-Division (÷)\n5-Get the result\n Answer:");
			operation = scan.nextInt();
			
			if(i>0 && operation > operationMemory) {
				operationQueue = 2;
			}
			else if(i>0 && operation < operationMemory) {
				operationQueue = 2;
			}
			else {
				operationQueue = 0;
			}
			
			while(operationQueue >= 0) {
				if(operationQueue == 2) {
					c = operation;
					operation = operationMemory;
					operationQueue--;
				}
				else if(operationQueue == 1){
					answer = 00012;
					operation = c;
					operationQueue-=2;
				}
				else if(operationQueue == 0) {
					operationQueue--;
				}
				
				if(operation == 1 || (operationMemory == 1 && operation == 5)) {
					if(i==0) {
						memory = answer;
					}
					if(answer==00012) {
						memory = memory + 0;
					}
					if(i!=0 && answer != 00012) {
						memory = memory + answer;	
					}
					operationMemory = 1;
					eq++;
				}
				else if(operation == 2  || (operationMemory == 2 && operation == 5)) {
					if(i==0) {
						memory = answer;
					}
					if(answer==00012) {
						memory = memory - 0;
					}
					if(i!=0 && answer != 00012) {
						memory = memory - answer;	
					}
					operationMemory = 2;
					eq++;
				}
				else if(operation == 3 || (operationMemory == 3 && operation == 5)) {
					if(i==0 && memory == 0) {
						memory = answer;
					}
					if(answer==00012) {
						memory = memory * 1;
					}
					if(i!=0 && answer != 00012) {
						memory = memory * answer;
					}
					operationMemory = 3;
					eq++;
				}
				else if(operation == 4 || (operationMemory == 4 && operation == 5)) {
					if(i==0 && memory == 0) {
						memory = answer;
					}
					if(answer==00012) {
						memory = memory / 1;
					}
					if(i!=0 && answer != 00012) {
						memory = memory / answer;
					}
					operationMemory = 4;
					eq++;
				}
				else {
					System.out.println("ERROR: operation selection...");
				}
			}
			
			if(operation == 5) {
				System.out.println("\n*************");
				System.out.println("* The result: "+memory);
				System.out.println("*************");
				break;
			}
		
		}

		PressEnterKeyToContinue();

	}
	public static void AreaCalculator() {
		System.out.println("***Area Caculator Opened***");

	}
	public static void PerimeterCalculator() {
		System.out.println("***Perimeter Caculator Opened***");

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
