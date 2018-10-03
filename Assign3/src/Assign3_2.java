/*
 Written by Bryan Berrent
 This program asks a user for a string
 Counts the amount of vowels
 Counts the amount of consonants
 Calculates the price based off
 of the amount of vowels 
 Outputs results
 */

import java.util.*;

public class Assign3_2 {
	public static void main(String[] args) {
		
		//Initialize variables
		
		String sent = "";
		int vowel = 0;
		int consonant = 0;
		int price = 0;
		Scanner input = new Scanner(System.in);
		
		//Ask user to enter a string
		System.out.println("Enter a string: ");
		sent = input.nextLine();
		
		sent = sent.toLowerCase();
		
		
		//Compute the amount of vowels and consonants
		for(int i = 0; i < sent.length(); i++){
				if(sent.charAt(i)=='a' || sent.charAt(i)=='e' || sent.charAt(i)== 'i' || sent.charAt(i)=='o' || sent.charAt(i)=='u'){
					vowel++;
				}
				else if(Character.isAlphabetic(sent.charAt(i))==true){
					consonant++;
				}
		}
		
		
		//Compute the price
		price = vowel * 250;
		
		//Output results
		System.out.println("The number of vowels are "+vowel);
		System.out.println("The number of consonants are " + consonant);
		System.out.println("The price is $" + price);
	}
}
