/*
 This program implements 
 an extremely bare-bones version of 
 the game NetHack
 
 Written by Bryan Berrent
 */

import java.util.*;

public class Assign4_2 {

	public static void main(String[] args) {
		final int ROW = 10;
		final int COL = 20;
		Scanner scan = new Scanner(System.in);
		String input = "w";

		
		String [][] map = new String [ROW][COL];
		
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COL; j++){
				map[i][j]=".";
			}
		}
		
		
		String [][] displayBuffer = new String[ROW][COL];
		
		int [] playerCoords = {0,0};
		
		
		do{
			//Copies the contents of map into the displayBuffer
			for(int i = 0; i < ROW; i++){
				for(int j = 0; j < COL; j++){
					displayBuffer[i][j]=map[i][j];
				}
			}
			
			//Places the position of the @ symbol into the display
			displayBuffer[playerCoords[0]][playerCoords[1]]="@";
			
			//Outputs the map
			for(int i = 0; i < ROW; i++){
				for(int j = 0; j < COL; j++){
					System.out.print(displayBuffer[i][j]);
				}
				System.out.println(" ");
			}
			
			System.out.println("Enter action: ");
			input = scan.nextLine();
			
			//Moves @ symbol up
			if(input.equals("w") && playerCoords[0] != 0){
				displayBuffer[playerCoords[0]][playerCoords[1]]=".";
				playerCoords[0] = playerCoords[0] - 1;
				
			}
			//Moves @ symbol down
			if(input.equals("s") && playerCoords[0] != 9){
				displayBuffer[playerCoords[0]][playerCoords[1]]=".";
				playerCoords[0] = playerCoords[0] + 1;
			}
			//Moves @ symbol right
			if(input.equals("d") && playerCoords[1] != 19){
				displayBuffer[playerCoords[0]][playerCoords[1]]=".";
				playerCoords[1] = playerCoords[1] + 1;
			}
			//Moves @ symbol left
			if(input.equals("a") && playerCoords[1] != 0){
				displayBuffer[playerCoords[0]][playerCoords[1]]=".";
				playerCoords[1] = playerCoords[1] - 1;
			}
			
		}while(!input.equals("q"));
		

	}

}
