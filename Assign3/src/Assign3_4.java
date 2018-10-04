/*
 Written by Bryan Berrent
 This program asks the user for a phone number
 Translates each instance of a letter with the corresponding number
 Outputs the new formatted phone number 
 */
import java.util.*;

public class Assign3_4 {
	public static void main(String[] args) {
		
		//Initialize Variables
		String pNum = " ";
		String output = " ";
		
		Scanner input = new Scanner(System.in);
		
		//Obtain phone number from user
		System.out.println("Enter a string: ");
		pNum = input.nextLine();
		pNum = pNum.toUpperCase();
		
		System.out.print(pNum+" is translated to ");
		
		//Loop to convert the number
		for(int i = 0; i < pNum.length(); i++){
			if(Character.isAlphabetic(pNum.charAt(i))){
				int num = getNumber(pNum.charAt(i));
				System.out.print(num);
			}
			else{
				System.out.print(pNum.charAt(i));
			}
		}
	
		
		
	}
	
	//Method to convert letters into numbers
	public static int getNumber(char upperCaseLetter){
		int convLetter = 0;
		if(upperCaseLetter == 'A' || upperCaseLetter == 'B' || upperCaseLetter == 'C'){
			convLetter = 2;
		}
		if(upperCaseLetter == 'D' || upperCaseLetter == 'E' || upperCaseLetter == 'F'){
			convLetter = 3;
		}
		if(upperCaseLetter == 'G' || upperCaseLetter == 'H' || upperCaseLetter == 'I'){
			convLetter = 4;
		}
		if(upperCaseLetter == 'J' || upperCaseLetter == 'K' || upperCaseLetter == 'L'){
			convLetter = 5;
		}
		if(upperCaseLetter == 'M' || upperCaseLetter == 'N' || upperCaseLetter == 'O'){
			convLetter = 6;
		}
		if(upperCaseLetter == 'P' || upperCaseLetter == 'Q' || upperCaseLetter == 'R' || upperCaseLetter == 'S'){
			convLetter = 7;
		}
		if(upperCaseLetter == 'T' || upperCaseLetter == 'U' || upperCaseLetter == 'V'){
			convLetter = 8;
		}
		if(upperCaseLetter == 'W' || upperCaseLetter == 'X' || upperCaseLetter == 'Y' || upperCaseLetter == 'Z'){
			convLetter = 9;
		}
		return convLetter;
	}
}
