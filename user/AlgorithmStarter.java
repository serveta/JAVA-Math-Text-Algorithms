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
				new Q1(), new Q2(), new Q3()
		};
		Answer[] answer = {
				new A1(), new A2(), new A3()
		};
		
		for(int i=0;i<question.length;i++) {
			if(i==0){
				question[i].getQuestion();
			}
			if(i==1) {
				new Q2(answerStr).getQuestion();
			}	
			for(int j=0;j<1;j++) {
				if(i==0) {
					Scanner scan = new Scanner(System.in);
					answerStr = scan.nextLine();
					answer[i].getAnswer(answerStr);
				}
				else {
					Scanner scan = new Scanner(System.in);
					answerInt = scan.nextInt();
					
					if(answerInt==0) {
						i=i-2;
					}
					else {
						//answer[i].getAnswer(answerInt);
						answer[i].nextQuestion(answerStr,answerInt);
					}
				}
			}
		}
				
	}
}
