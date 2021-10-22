package choice;

public class Choice {
	public void firstChoice(String userName) {
		System.out.println("What do you want me to do "+userName+"?");
		System.out.println("********************");
		System.out.println("*choice- definition*");
		System.out.println("*1- About Math");
		System.out.println("*2- About Text");
		System.out.println("********************");
	}
	
	public void MorT(String choice) {
		if(choice.equals("1")) {
			System.out.println("******MATH**********");
			System.out.println("*choice- definition*");
			System.out.println("*1- Circle Calculation");
			System.out.println("*2- Empty");
			System.out.println("********************");
		}
		else if(choice.equals("2")) {
			System.out.println("******TEXT**********");
			System.out.println("*choice- definition*");
			System.out.println("*1- ReverseText");
			System.out.println("*2- Empty");
			System.out.println("********************");
		}
		else {
			System.out.println("WRONG CHOICE!");
		}
	}
}
