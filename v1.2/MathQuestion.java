
public class MathQuestion extends Question {
	
	private int[] answers;
	
	public MathQuestion(int length) {		
		super(length);
		answers = new int[length];
	}
	
	public void newQuestion(String question, int selectionRange) {
		if(questionLengthControl == length) {
			System.out.println("WARNING: You can add only "+length+" Math Questions. If you want to add more question change the length please!");
			questionLengthControl++;
			return;
		}
		else if(questionLengthControl > length) {
			return;
		}
		if(questionLengthControl < length) {
			this.question = question;
			this.selectionRange = selectionRange;
			save();	
			questionLengthControl++;
		}
	}
	
	public void getQuestion(int questionNo) {
		if(questionNo >= length) {
			System.out.println("Question "+questionNo+" could not be found!");
			return;
		}
		else {
			System.out.print(questions[questionNo]);	
		}
	}
	
	public void getSelectionRange(int questionNo) {
		if(questionNo >= length) {
			System.out.println("The selection range for question "+questionNo+" could not be found.");
			return;
		}
		else {
			System.out.println(questionSelectedRange[questionNo]);
		}		
	}
	
	public void answer(int answerNo, int answer) {
		answers[answerNo] = answer;
	}
	
	public int getAnswer(int answerNo) {
		return answers[answerNo];
	}
	

}
