package pieces;

import game.Player;

public class Pawn {

	/*
	 * For now, Pawns are going to be the only type of piece needed. However I want to build this program in a way that allows me to
	 * add different pieces with new actions later on.
	 * 
	 * A Pawn takes up one tile at a time.
	 * 
	 * It can perform one of two actions:
	 * 
	 * 1. move: the piece moves one tile in the direction of the opponents side of the board, onto a tile that is EMPTY.
	 * 
	 * move.white = (y+1) 
	 * move.black = (y-1)
	 * 
	 * 2. take: the piece moves one tile in the direction of the opponent's side of the board and one tile to either left or right,
	 * onto a tile that is OCCUPIED BY AN OPPONENT'S PIECE. If a tile is either empty, or occupied by an allied piece,
	 * it cannot be moved onto with the take action.
	 * 
	 * takeLeft.white 	= 	(x-1; y+1) or (x-1; move.white)
	 * takeRight.white 	=	(x+1; y+1) or (x+1; move.white)
	 * takeLeft.black	=	(x-1; y-1) or (x-1; move.black)
	 * takeRight.black	=	(x+1; y-1) or (x+1; move.black)
	 * 
	 * Just like a Tile, any piece has coordinates to determine it's location.
	 */
	
	//Attributes of a Pawn
	
	//Coordinates on the Board
	public int xCo;
	public int yCo;
	
	//to determine which Player owns this Piece
	public Player player; 
	
	public String color;
	
	//Constructor for Pawn
	
	public Pawn(int xCoordinate, int yCoordinate, String colorOfPiece) {
		this.xCo = xCoordinate;
		this.yCo = yCoordinate;
		this.color = colorOfPiece; 
	}
	
	//Setter for xCo
	void setxCo(int xCoordinate) {
		this.xCo = xCoordinate;
	}
	
	//getter for xCo
	int getxCo() {
		return xCo;
	}
	
	//setter for yCo
	void setyCo(int yCoordinate) {
		this.yCo = yCoordinate;
	}
	
	//getter for yCo
	int getyCo() {
		return yCo;
	}
	
	//setter for Player
	void setPlayer(Player controller) {
		this.player = controller;
	}
	
	//getter for Player
	Player getPlayer() {
		return player;
	}
	
	//setter for color
	void setColor(String colorOfPiece) {
		this.color = colorOfPiece;
	}
	
	//getter for color
	String getColor() {
		return color;
	}
	
	//move action
	public int move() {
		
		this.yCo = this.yCo+1;
		
		return this.xCo & this.yCo;
	}
}
