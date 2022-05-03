
import java.util.Random;
import java.util.Scanner;

public class PromptBank {
	private String[] questions;
	private String[] statements;
	
	 private String word1;
	private String lastW ;
	private String symbol;
	
	public PromptBank() {
		word1 = " ";
		lastW = " ";
		symbol = "";
		questions = new String[3];
		statements = new String[3];
	}
	public void populateStatementsArray(String word1, String lastW) {	
		
		this.word1 = word1;
		this.lastW  =lastW;
 statements[0] = "You talked about "+word1+" and "+lastW+" and it sounds like it bothers you. Talk about it";
	 	
 statements[1] = word1+" and "+lastW+" seem to be very dear to you. Explain further.";
	 	
 statements[2] = "Talk more about  \""+word1+"\" and \""+ lastW+"\"";
	 
	}
	public void populateQuestionsArray(String word1, String lastW) {
		this.word1 = word1;
		this.lastW  =lastW;
  questions[0] ="what do you mean by \""+word1+"\" and \""+lastW+"\" ?";;
	 	   
  questions[1] ="do you relate most with "+ lastW +" and "+word1+" ?";
	 	  
  questions[2] = "It sounds like "+word1 + " and "+ lastW+" are things you think about often?";
	 	 
	 	  
	}
	 public void getRandomStatementTrunk(String word1, String lastW, String symbol) {
		 this.word1 = word1;
			this.lastW  =lastW;
			this.symbol = symbol;
		 Random random;
		 int num;
		 random = new Random();
		 num = random.nextInt(3);
		
	 	   if(!word1.equalsIgnoreCase("exit")) {
	 	    if(symbol.equals("!")) {
	 	    	System.out.println("OKAY!! no need to raise your voice at me i'm just trying to help. ");
	 	    	
	 	    }
	 	   }
	 	   if(!(symbol.equals("!"))) {
	 		   if(!(symbol.equals("?"))) {
	 			  if(!word1.equalsIgnoreCase("exit")) {   
	 	  System.out.println(statements[num]);
	 	   }
	 	   }
	 	   }
	 	   
	 }
	 public void getRandomQuestionTrunk(String word1, String lastW, String symbol) {
	  this.word1 = word1;
		this.lastW  =lastW;
	 			this.symbol = symbol;
	 		  Random random;
	 		 int num;
	 		 random = new Random();
	 		 num = random.nextInt(3);
		 	  
		 	    if(!word1.equalsIgnoreCase("exit")) {
		 	    if(symbol.equals("?")) {
		 	   
		 	    	System.out.println(questions[num]);
		 	    	 }
		 	       }

  
		
	 }
	 	   public void setWord1(String word1) {
	 		   this.word1 = word1;
	 	   }
	 	   public void setLastW(String lastW) {
	 		   this.lastW = lastW;
	 	   }

}
