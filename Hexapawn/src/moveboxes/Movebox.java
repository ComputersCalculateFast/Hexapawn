package moveboxes;

public class Movebox {
	
	/*
	 * Moveboxes are the brain of this A.I.. The game starts with 24 of them, one box for every possible arrangement of pieces controled
	 * by the A.I.
	 * 
	 * A movebox contains up to three different actions the A.I. can perform. 
	 * 
	 * Every time the A.I. needs to take an action it determines one of those moveboxes that matches the current position of their pieces
	 * on the board. Then, one of the actions that movebox contains is chosen randomly and that action is executed.
	 * 
	 * Once a game has ended and if the A.I. lost that game, all actions that had been used in that game are removed and won't be chosen
	 * in future games.
	 * 
	 * Hence, the A.I. can only use actions that it previously won with, or hasn't used before.
	 */

}
