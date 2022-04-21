
public class TextQuestion extends Question {
	
	private String[] answers;
	
	public TextQuestion(int length) {		
		super(length);
		answers = new String[length];
	}
	
	public void newQuestion(String question, int selectionRange) {
		if(questionLengthControl == length) {
			System.out.println("WARNING: You can add only "+length+" Text Questions. If you want to add more question change the length please!");
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
			System.out.println("Text Question "+questionNo+" could not be found!");
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
	
	public void answer(int answerNo, String answer) {
		answers[answerNo] = answer;
	}
	
	public String getAnswer(int answerNo) {
		return answers[answerNo];
	}
	

}
