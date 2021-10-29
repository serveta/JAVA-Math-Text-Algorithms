package question;

public class Q2 {
	
	private String userName;
	private String welcome = "Hi! Welcome, ";
	private String question = "\n 1-Math \n 2-Text \n Enter your choice: ";
	
	public Q2() {
		
	}
	public Q2(String user) {
		this.userName = user;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getWelcome() {
		return welcome;
	}
	
	public void getQuestion() {
		 System.out.print(getWelcome()+getUserName()+question);
	}
	
}
