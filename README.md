# Dama
#### Video Demo:  <https://youtu.be/3t_2NDYo-oE>
#### Description:
This project is a digital implementation of Dama Italiana (Italian Checkers), a traditional strategy board game. The game is played on an 8x8 board with 24 pieces—12 white and 12 black—arranged on the dark squares. Players take turns moving diagonally, capturing their opponent’s pieces, and promoting pieces to "dama" (queen) by reaching the last row. The goal is to capture all the opponent's pieces or block their ability to move.

The application is built using Java and features a graphical user interface (GUI) for an intuitive and enjoyable experience. It ensures adherence to the rules of Italian Checkers, making it suitable for both beginners and experienced players.

Features
Graphical User Interface (GUI):

The board is displayed as an 8x8 grid using JButton components.
Dark and light squares alternate, with gameplay restricted to dark squares.
Player pieces are visually represented using distinct icons for white, black, and dama pieces.
Labels track the current player’s turn and the number of remaining pieces for each side.
Turn-Based Gameplay:

Players alternate turns, and the game enforces the rules of movement and capturing.
Legal Move Validation:

Movements are checked for legality based on the game rules, including diagonal movement and capturing.
Dama Promotion:

Pieces are promoted to dama when they reach the opponent's last row, gaining additional movement capabilities.
Win Condition:

The game ends when one player captures all opponent pieces or blocks them from making legal moves.
Error Handling:

Invalid moves are highlighted, and the player is prompted to retry.
File Descriptions
Main Classes
Dama.java
This is the main class that initializes the game and its GUI. It handles:

Creating the game board using JButton components.
Setting up the layout for player turn and score indicators.
Managing player turns and invoking the Mossa class to validate moves.
Handling the promotion of pieces to dama.
Declaring the winner when all opponent pieces are captured.
The creaFrame method sets up the main game window and layouts, while the prepDamiera method initializes the board with alternating square colors and piece placements.

Mossa.java
This class contains the logic for validating moves. It checks:

Standard Moves: Ensures diagonal movement of one square for regular pieces.
Captures: Validates double-square diagonal moves for capturing opponent pieces.
Dama Moves: Allows dama pieces to move diagonally in any direction and capture pieces in their path.
The controlloC1 method enforces these rules based on the piece type (regular or dama) and its color (white or black). Captured pieces are removed from the board by setting their icons to null.

Pedina.java (Not provided but inferred)
Represents individual game pieces, managing:

Piece color (white or black).
Icons for regular pieces and dama.
Methods for interacting with the GUI components.
How It Works
Setup:

Run the Dama class to start the game.
The GUI initializes, displaying the board and player indicators.
Gameplay:

Players select a piece and its destination square.
Valid moves update the board, while invalid attempts prompt the player to retry.
Pieces reaching the opponent's last row are automatically promoted to dama.
Winning:

The game ends when a player has no pieces left or cannot make a legal move.
A pop-up announces the winner.
