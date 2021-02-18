package moveboxes;

public class Movebox {
	
	/*
	 * Moveboxes are the brain of this A.I.. The game starts with 24 +23 of them, one box for every possible arrangement of pieces.
	 * The additional 23 Moveboxes can be created by mirroring the original box, with one of them being symmetrical anyway.
	 * 
	 * A Movebox contains up to three different actions the A.I. can perform. 
	 * 
	 * Every time the A.I. needs to take an action it determines one of those Moveboxes that matches the current position of their pieces
	 * on the board. Then, one of the actions that Movebox contains is chosen randomly and that action is executed.
	 * 
	 * Once a game has ended and if the A.I. lost that game, the last action that had been executed is removed and won't be chosen
	 * in future games.
	 * 
	 * Hence, the A.I. can only use actions that it previously won with, or hasn't used before.
	 * 
	 * If the last action of a Movebox would be removed, all moves it originally contained are restored.
	 */

}
