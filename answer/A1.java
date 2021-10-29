package answer;

import question.*;

public class A1 {
	private String userName;
	
	public A1(String userName) {
		this.userName = userName;
	}
	
	public void nextQuestion() {
		Q2 q2 = new Q2(this.userName);
		q2.getQuestion();
	}
	
}
