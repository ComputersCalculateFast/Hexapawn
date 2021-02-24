package game;

import java.util.*;
import board.Tile;
import pieces.Pawn;

public class Main {

	public static void main(String[] args) {


		//Create a List to store the Tile Objects in
		List<Tile> tiles = new ArrayList<>(); 
		List<Pawn> pawns = new ArrayList<>();

		/*Creating the Tile Objects in one go.
		 * This loop generates 9 Tiles with the coordinates from (1,3) to (3,1)
		 * for further information, look at Tile class
		 * Every Tile is added to the List tiles and can be accessed through it
		 */
		for(int i = 1; i < 4; i++){
			for(int j = 1; j < 4; j++){
				tiles.add(new Tile(i,j));

				//creating Pawns and defining their color in one take 
				if(j == 1 || j == 3) {
					if(j != 1) {
						pawns.add(new Pawn(i,j, "Black"));

					} else {
						pawns.add(new Pawn(i,j, "White"));
					}
				}
			}
		}

	System.out.println(pawns.get(0).xCo + "," + pawns.get(0).yCo);
	
	pawns.get(0).take();
	
	System.out.println(pawns.get(0).xCo + "," + pawns.get(0).yCo);
	
	
		

	}
}

