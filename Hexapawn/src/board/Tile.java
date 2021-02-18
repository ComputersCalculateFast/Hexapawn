package board;

public class Tile {
	
	/* 
	 * This class will define what properties a tile has.
	 * Tiles are the single areas of the board a piece can move to.
	 * 
	 * A tile will be signed an X and Y Coordinate to define it's location. Since the board consists of a 3x3 grid of tiles, the coordinates
	 * are as follows.
	 * 
	 * (1,3)	(2,3)	(3,3)
	 * (1,2)	(2,2)	(3,2)
	 * (1,1)	(2,1)	(3,1)
	 * 
	 * A tile can be empty, which means other pieces can move to it's location (but not use the take action).
	 * 
	 * A tile can be occupied, which makes it impossible for any other piece to move to it's location. However a piece can use the take action
	 * to move to a tile occupied by an opponents piece and remove that piece from the game.
	 * 
	 *  
	 */

	// Attributes of a Tile
	
	boolean occupied;
	int xCo;
	int yCo;
	
	// Methods of a Tile
	
	// Determining whether a Tile is empty or not by comparing the coordinates of Tiles and Pieces
		void setOccupied(int xCoordinatePiece, int yCoordinatePiece) {
		
		if(xCoordinatePiece == this.xCo && yCoordinatePiece == this.yCo) {
			occupied = true;
		} else {
			occupied = false;
		}
	}
	
	
	// getting information if Tile is empty of occupied.
	boolean getOccupied(boolean occupied) {
		return occupied;
	}
	
	
	
}

