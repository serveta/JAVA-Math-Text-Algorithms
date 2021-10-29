package answer;
import question.*;

public class A2 {
	private int choice; 
	
	public A2(int choice) {
		this.choice = choice;
	}
	
	private void previousQuestion() {
		
	}
	
	public void nextQuestion() {
		if (this.choice == 0) {
			previousQuestion();
		}
		else if (this.choice == 1) {
			Q3 q3 = new Q3();
			q3.getQuestion();
		}
	}
}
