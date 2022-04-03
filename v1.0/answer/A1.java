package answer;

import question.*;

public class A1 extends qNa.Answer {
	private String userName;
	
	public void getAnswer(String userName) {
		this.userName = userName;
	}
	
	public void getAnswer() {
		
	}
	
	public void nextQuestion() {
		Q2 q2 = new Q2(this.userName);
		q2.getQuestion();
	}
	
}
