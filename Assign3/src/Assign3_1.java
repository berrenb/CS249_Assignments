/*
 Written by Bryan Berrent
 This program prints ASCII characters from ! to ~
 */

public class Assign3_1 {
	public static void main(String[] args) {
		
		//Initialize variables
		int start = (int)'!';
		int end = (int)'~';
		int count = 0;
		
		//Loop to print out ASCII characters
		for(int i = start; i <= end; i++){
			if(count%10 == 0 && count!=0){
				System.out.println(" ");
			}
			char output = (char)i;
			System.out.print(output + " ");
			count++;
		}

	}
}
