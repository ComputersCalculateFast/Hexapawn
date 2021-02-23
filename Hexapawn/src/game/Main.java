package game;

import java.util.*;

import board.Tile;

public class Main {

	public static void main(String[] args) {

		
		//Create a List to store the Tile Objects in
		List<Tile> tiles = new ArrayList<>(); 

		/*Creating the Tile Objects in one go.
		 * This loop generates 9 Tiles with the coordinates from (1,3) to (3,1)
		 * for further information, look at Tile class
		 */
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				tiles.add(new Tile(i,j));
			}
		}

		
		
	}

}

