package user;

import java.util.Scanner;
import question.*;
import answer.*;

public class AlgorithmStarter {
	
	//static Scanner scan = new Scanner(System.in);
	static int answerInt=0;
	public static int request(int r) {
		return answerInt = r;
	}
	
	public static void main(String[] args) {
		
		int i=1;
		
		do {
			if (answerInt == 5) {
				i = answerInt ;
			}

				if (i==1) {
					question1();
					i++;
				}
				if (i==2) {
					question2();
				}
				if (i==3) {
					question3();
				}
				if (i==5) {
					i--;
				}
				
			
			
			/*
			switch (i) {
			case 1:question1(); i=2; continue;
			case 2:question2(); i=3; break;
			case 3:question3(); break;
			default:
				//System.out.print("Error"); 
				break;
			}
			
			
			//guide(i);
			*/
		} while (i<4);

	}
	
	public static void guide(int request) {
		
		
		//question1();
		//question2();
		//question3();
	}
	
	public static void question1() {
		String answerStr;
		Q1 q1 = new Q1();
		q1.getQuestion();
		Scanner scan = new Scanner(System.in);
		answerStr = scan.nextLine();
		A1 a1 = new A1(answerStr);
		a1.nextQuestion();
	}
	
	public static void question2() {
		int answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextInt();
		//answerInt = answer;
		A2 a2 = new A2(answer);
		a2.nextQuestion();
		request(answer);
	}
	
	public static void question3() {
		Scanner scan = new Scanner(System.in);
		answerInt = scan.nextInt();
		A3 a3 = new A3(answerInt);
		a3.nextQuestion();
	}

}
