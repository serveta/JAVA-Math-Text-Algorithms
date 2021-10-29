package user;

import java.util.Scanner;
import question.*;
import answer.*;

public class AlgorithmStarter {
	
	static Scanner scan = new Scanner(System.in);
	static String answerStr;
	static int answerInt;
	
	public static void main(String[] args) {

		question1();
		question2();
		question3();
		
	}
	
	public static void question1() {
		Q1 q1 = new Q1();
		q1.getQuestion();
		answerStr = scan.nextLine();
		A1 a1 = new A1(answerStr);
		a1.nextQuestion();
	}
	
	public static void question2() {
		answerInt = scan.nextInt();
		A2 a2 = new A2(answerInt);
		a2.nextQuestion();
	}
	
	public static void question3() {
		answerInt = scan.nextInt();
		A3 a3 = new A3(answerInt);
		a3.nextQuestion();
	}

}
