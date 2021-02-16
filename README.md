# Hexapawn

##### About the Project

This is a private project of mine. I'm planning to improve my programming skills by programming a simple game with an even simpler artificial intelligence. 
Basically, I am just adopting an Idea of a VSauce2 Video on the Hexapawn game and implementing it in JAVA and I know right off the bat, 
that I will need help to complete this project. I am hoping that GitHub and the Community of stackoverflow will be able to support me when I don't know how to proceed.


## The Game

Hexapawn is played on a board that consists of a 3x3 grid. 
Two players are facing each other and both take control over 3 Pawns which are capable of executing any move a pawn in a chess game would be able to do.
(move one tile forward to an unoccupied tile, or take the opponent's pieces on the left or right diagonal tiles in front of it)

The user takes command of Player 1, Player 2 is an "A.I." which works in a very simple way.

The User and A.I. will be taking turns and try to accomplish one of three win conditions:

1. Get one of your pawns to the other side of the board.
2. Take all of your opponents pieces.
3. Or "Checkmate your opponent, which means that there is no legal move to execute.


## The "Artificial Intelligence"

This is not really going to be something that should be called "intelligent", but the A.I. will be able to learn and be more efficient every time it's challenged.
You can also watch this [Video](https://www.youtube.com/watch?v=sw7UAZNgGg8) by VSauce2 to learn about the Concept of the game.

##### Moveboxes

The A.I. is based on a number of pre determined moves it can execute. Every such move is part of a Movebox. A Movebox is a collection of moves.
There will be 24 Moveboxes.

