/*
 Written by Bryan Berrent
 Uses adaptation from class notes
 This program gets a string from the user
 Replace all instances of squirrel with ...SQUIRREL!... 
 Outputs results
 */
import java.util.*;

public class Assign2_3 {

	public static void main(String[] args) {
		
		//Initialize variables
		String sentence = "";
		String squirrelSent = "";
		int startIndex = 0;
		boolean endOfString = false;
		Scanner scan = new Scanner(System.in);
		
		//Gets a sentence from user
		System.out.println("Enter a sentence: ");
		sentence = scan.nextLine();
		
		
		while(endOfString == false){
			
			//Checks if there are no instances of squirrel
			if(sentence.indexOf("squirrel",startIndex) == -1 && squirrelSent.isEmpty()){
				System.out.println(sentence);
				endOfString = true;
			}
			
			//Checks if an instance of squirrel occurs
			else if(sentence.indexOf("squirrel",startIndex) != -1){
				squirrelSent+=sentence.substring(startIndex, sentence.indexOf("squirrel",startIndex) );
				squirrelSent+="...SQUIRREL!...";
				startIndex = sentence.indexOf("squirrel",startIndex);
				startIndex += 8;
			}
			
			//If no more instances of squirrel occurs, the rest 
			//of the string is added to squirrelSent
			else{
				squirrelSent+=sentence.substring(startIndex);
				endOfString = true;
			}
			
		}
		
		System.out.println(squirrelSent);
		
	}

}
