package user;

import java.util.Scanner;
import question.*;
import answer.*;
import qNa.*;

public class AlgorithmStarter {

	public static void main(String[] args) {
		String answerStr="";
		int answerInt;
		
		Question[] question = {
				new Q1(), new Q2(), new Q3(), new Q3q1AreaCalculation()
		};
		Answer[] answer = {
				new A1(), new A2(), new A3(), new A3a1AreaCalculation()
		};
		
		for(int i=0;i<question.length;i++) {
			if(i==0){
				question[i].getQuestion();
			}
			if(i==1) {
				new Q2(answerStr).getQuestion();
			}	
			for(int j=0;j<1;j++) {
				/*if(i==question.length) {
					System.out.println("Do you want to do anything else " 
							+ answerStr + "?"
							+ "\n 1- return the first menu"
							+ "\n 2- return last menu"
							+ "\n 3- close the program");
					Scanner scan = new Scanner(System.in);
					answerInt = scan.nextInt();
					if(answerInt==1) {
						i=1;
					}
					else if(answerInt==2) {
						j=-1;
					}
					else {
						break;
					}
				}*/
				if(i==0) {
					Scanner scan = new Scanner(System.in);
					answerStr = scan.nextLine();
					answer[i].getAnswer(answerStr);
				}
				else {
					/*if(j==-1) {
						i=i-2;
						answerInt=0;
						j=0;
					}
					else {*/
						Scanner scan = new Scanner(System.in);
						answerInt = scan.nextInt();
					//}
					if(answerInt==0) {
						i=i-2;
					}
					else {
						answer[i].nextQuestion(answerStr,answerInt);
					}
				}
			}
		}
		System.out.println(reverseText("The program has been terminated "+answerStr+". See you later...")+"<<<");
	}
	public static String reverseText(String text) {
		String reverseText="";
		
		for(int i=text.length()-1;i>=0;i--) {
			reverseText += text.charAt(i);
		}
		
		return reverseText;
	}
}
