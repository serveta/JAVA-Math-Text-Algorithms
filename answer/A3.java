package answer;
import question.*;
public class A3 {
private int choice; 
	
	public A3(int choice) {
		this.choice = choice;
	}
	
	private void previousQuestion() {
		Q2 q2 = new Q2();
		q2.getQuestion();
	}
	
	public void nextQuestion() {
		if (this.choice == 0) {
			previousQuestion();
		}
		else if (this.choice == 1) {
			//Q3q1 q3q1 = new Q3q1();
			//q3q1.getQuestion();
		}
	}
}
