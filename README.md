# Dama
#### Video Demo:  <https://youtu.be/3t_2NDYo-oE>
#### Description:
Here’s the updated **README.md** file with all the provided information integrated:

---

# Italian Checkers (Dama Italiana)

## Project Overview

This project is a digital recreation of *Dama Italiana* (Italian Checkers), a traditional board game of strategy and tactics. Played on an 8x8 checkered board with 12 white and 12 black pieces, players aim to capture all of their opponent’s pieces or block their moves entirely. Pieces move diagonally, and reaching the opponent’s back row promotes a piece to "dama" (queen), granting enhanced movement capabilities.

The game is built in Java, with a user-friendly graphical interface (GUI) and strict adherence to the official rules of Italian Checkers.

---

## Features

- **Interactive GUI**:  
  A visually appealing 8x8 board built using `JButton` components, with alternating light and dark squares. Player pieces are represented with icons, and scores are displayed dynamically.  
- **Turn-Based Gameplay**:  
  Alternating turns between two players with real-time updates on the current turn and captured pieces.  
- **Legal Move Validation**:  
  All moves are checked against the game rules, including valid diagonal movements and capturing.  
- **Dama Promotion**:  
  Pieces reaching the last row are promoted to dama and gain additional movement capabilities.  
- **Victory Screen**:  
  A custom victory window announces the winner with a corresponding background image.  
- **Error Handling**:  
  Prevents invalid moves and highlights errors to guide players.  

---

## File Descriptions

### Main Classes

#### **`Dama.java`**
This is the main class responsible for initializing and running the game. It includes:  
- GUI setup with methods `creaFrame` (for window layout) and `prepDamiera` (for board initialization).  
- Turn management and integration with the `Mossa` class to validate moves.  
- Promotion logic for pieces reaching the back row and handling game-ending conditions.  

#### **`Mossa.java`**
This class manages move validation and game rules. Key functionalities include:  
- Validating standard diagonal moves for regular pieces.  
- Checking capture moves and removing captured pieces from the board.  
- Supporting advanced diagonal moves for dama pieces.  
- Ensuring each move follows Italian Checkers rules.  

#### **`Pedina.java`** *(Inferred from other files)*  
Represents individual game pieces with attributes like:  
- Piece type (regular or dama).  
- Piece color (white or black).  
- Methods for interaction with the board and GUI.

#### **`Vittoria.java`**
The `Vittoria` class is responsible for displaying a victory screen when the game concludes. It dynamically selects the appropriate background image based on the winner.  
- **Dynamic Background**: Displays either `neroVince.png` or `biancoVince.png`, depending on whether black or white wins.  
- **Custom Window**: Creates a visually appealing `JFrame` titled "Victory!" to celebrate the winner.

### Images

#### All Images and backgrounds have been created from scratch from us.

---

## How to Play

1. **Setup**:  
   Run the `Dama` class to launch the game. The GUI will display the board, player pieces, and turn/score indicators.  

2. **Gameplay**:  
   - Players select a piece and a valid destination.  
   - Moves must follow diagonal paths, with captures prioritized when available.  
   - Pieces reaching the opponent's back row are promoted to dama automatically.  

3. **Winning**:  
   - The game ends when a player has no pieces left or cannot make a valid move.  
   - A victory screen announces the winner.

---

## Authors

This project was developed by:  
- **Melek Chteoui**  
- **Simone La Salvia**

---

This description was written with help from AI tools.
