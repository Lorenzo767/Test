import java.util.Random;
import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String map[][] = new String[8][8];

		System.out.println("Hi, let's play Battleship!");
		System.out.println();


		for(int i = 0; i < 6; i++) {
			System.out.print("Enter the coordinates of your " + "ship" + " #" + (i+1) + ": ");
			String coordinate = input.next();
			coordinate = coordinate.toLowerCase();
			int row = coordinate.charAt(1) - '1';
			int col = coordinate.charAt(0) - 'a';
			/* check if repeated or out of bounds */ 
			System.out.println(col + " " + row);
			while(!(row >= 0 && row < 8 && col >= 0 && col < 8) || map[col][row] != null) {
				if(!(row >= 0 && row < 8 && col >= 0 && col < 8))
				System.out.println("Sorry, coordinates are outside the 8x8 grid ");
				else
				System.out.println("Sorry, coordinates have already been used.");
				System.out.print("Enter the coordinates of your " + "ship" + " #" + (i+1) + ": ");
				coordinate = input.next();
				coordinate = coordinate.toLowerCase();
				row = coordinate.charAt(1) - '1';
				col = coordinate.charAt(0) - 'a';
				System.out.println(col + " " + row);				
			}
			map[col][row] = "Hship";

		}
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter the coordinates of your " + "grenade" + " #" + (i+1) + ": ");
			String coordinate  = input.next();
			coordinate = coordinate.toLowerCase();
			int row = coordinate.charAt(1) - '1';
			int col = coordinate.charAt(0) - 'a';
	  
			while (!(row >= 0 && row < 8 && col >= 0 && col < 8) || map[col][row] != null ) {
			  if(!(row >= 0 && row < 8 && col >= 0 && col < 8))
				  System.out.println("Sorry, coordinates are outside the 8x8 grid ");
			  else
				  System.out.println("Sorry, coordinates have already been used.");
			  System.out.print("Enter the coordinates of your " + "ship" + " #" + (i+1) + ": ");
			  coordinate = input.next();
			  coordinate = coordinate.toLowerCase();
			  row = coordinate.charAt(1) - '1';
			  col = coordinate.charAt(0) - 'a';
			}
	  
			map[col][row] = "Hgrenade";
		  }

		for(int i = 0; i < 6; i++) {
			Random r = new Random();
			int row = r.nextInt(8);
			int col = r.nextInt(8);
			while(map[col][row] != null){
				 row = r.nextInt(8);
				 col = r.nextInt(8);
			}
			map[col][row] = "Cgrenade";
		}
		for (int i = 0; i < 4; i++) {
			Random r = new Random();
			int row = r.nextInt(8);
			int col = r.nextInt(8);
			while(map[col][row] != null){
				 row = r.nextInt(8);
				 col = r.nextInt(8);
			}
			map[col][row] = "Cship";
		}
			


		
		
		System.out.println("- - - - - - - -");
	}
	

	
/* 1. Prompt user for ship placement
 * 	  Method for placing prompting and placing things
 * 	  	array of things has its position and its what it gives and methods that prints where the thing will 
 * 2. Place ships
 * 3. Prompt for grenade 
 * 4. Place grenades 			fleet[i] = new Ship(coordinateChar, coordinateNum);
 * 5. Set ships and grenades at random for computer
 * 6. Take in position of rocket and calculate consequence. * 
 * 7. make a rocket fire randomly
 * 8. Repeat player's and C's turns until victory
 * 9. Display victor
 * Method place ships and place grenades.  */
}

