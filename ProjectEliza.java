
//https://youtu.be/0YxlUEtfhU0
import java.util.Scanner;

public class ProjectEliza {

	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		
		
	     String yes = "Start";
	     String name ="";
	    
			
while(!(yes.equalsIgnoreCase("yes"))) {	
				
	String exit = "start";
		
	System.out.println("you can always end the conversation by typing 'exit' at anytime :)");
	System.out.println(" ");
	System.out.println("Hello my name is Eliza, what is your name");
	 name  = os.nextLine();
	System.out.println("Hello "+ name+". Tell me what is on your mind today in 1 sentence.");
			
		
while(!(exit.equalsIgnoreCase("exit"))) {
				
				
	String reply = os.nextLine();
	String[] response = reply.split(" ");
	String word1  = response[0];
	String lastW = response[response.length -1];
	lastW = lastW.substring(0, lastW.length());
	String symbol = reply.substring(reply.length() -1);
	exit = word1;
			
			PromptBank ProjectEliza = new PromptBank();
			ProjectEliza.populateStatementsArray(word1, lastW);
			ProjectEliza.populateQuestionsArray(word1, lastW);
			ProjectEliza.getRandomQuestionTrunk(word1, lastW, symbol);
			ProjectEliza.getRandomStatementTrunk(word1, lastW, symbol);
			
			}
			System.out.println("Are you sure you want to end the session?");
			yes = os.nextLine();
		}
		System.out.println("Goodbye!  :))");
		
	}
	

}
