/*
 Created by Bryan Berrent
 
 Main class to test the WordCountData and WordCounter classes
 Asks users for file path or URL
 Passes the line of input into the method count from
 the WordCounter class and stores the results into an instance
 of the WordCountData class.
 Outputs the results
 
 */

import java.io.PrintWriter;
import java.util.*;

public class Assign7_2 {
	public static void main(String args[]){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a file path or URL: ");
			String path = scan.nextLine();
			WordCountData wcd = new WordCountData(0,0,0);
			wcd = WordCounter.count(path);
			System.out.println("INPUT: " + path);
			System.out.println("OUTPUT: " + "\n" + "Number of characters " + wcd.getChar() 
			+ "\n" + "Number of words: " + wcd.getWord() + "\n" + "Number of lines: " + wcd.getLine());
			PrintWriter output = new PrintWriter("output.txt");
			output.write(path);
			output.write("OUTPUT: " + "\n" + "Number of characters" + wcd.getChar() 
			+ "\n" + "Number of words: " + wcd.getWord() + "\n" + "Number of lines: " + wcd.getLine());
			output.close();
		}
		catch(Exception e){
			System.err.println("OH NO!");
		}
	}
}
