# Dama
#### Video Demo:  <https://youtu.be/3t_2NDYo-oE>
#### Description:
Here’s an expanded version of the README, approximately 750 words:

---

# Italian Checkers (Dama Italiana)

## Project Overview

Italian Checkers (*Dama Italiana*) is a strategic board game that has been digitally recreated in this project to deliver an immersive and engaging gaming experience. The game adheres to the traditional rules of Italian Checkers, offering players a chance to enjoy the classic gameplay in a modern interface. This project provides an interactive graphical environment where players can compete by strategizing moves, capturing opponent pieces, and ultimately achieving victory.

The game is played on a board consisting of 64 squares, alternating in color between light and dark. Only the dark squares are used for gameplay. Each player starts with 12 pieces, positioned on the dark squares closest to them. Players take turns moving their pieces diagonally, capturing their opponent's pieces, and promoting pieces to "dama" (queen) status by reaching the opponent's back row. The ultimate goal is to eliminate all of the opponent's pieces or block them from making a legal move.

---

## Objectives

1. **Capture Opponent's Pieces**: Players aim to capture all of their opponent’s pieces by jumping over them diagonally. 
2. **Promotion to Dama**: A piece that reaches the opponent’s last row is promoted to a "dama," which has enhanced movement capabilities.
3. **Win the Game**: The game ends when one player has no remaining pieces or no legal moves left.

The game combines strategic thinking and tactical maneuvering, making it enjoyable for players of all ages and skill levels.

---

## Features

1. **Graphical User Interface (GUI)**: 
   - The board is displayed as a grid of 64 squares using a matrix of `JButton` objects.
   - The dark squares are interactive and allow piece movements. The light squares are static.
   - Icons represent the white and black pieces, with clear visual cues for dama pieces.

2. **Real-Time Game Updates**:
   - Dynamic labels on the interface keep track of each player's turn.
   - The number of remaining pieces for both players is displayed in real-time.

3. **Turn-Based Gameplay**:
   - The game alternates between two players, ensuring fairness and smooth flow.

4. **Victory Condition Detection**:
   - The game automatically detects and announces the winner when one player captures all opponent pieces or blocks their movement.

5. **Rule Enforcement**:
   - Legal moves are validated to ensure compliance with Italian Checkers rules. This includes the diagonal movement, capturing mechanics, and dama promotion.

---

## File Descriptions

### 1. Code Files
The project is organized into several Java classes, each serving a distinct purpose in the implementation:

- **`Dama.java`**:  
  This is the main class that drives the game. It initializes the board, manages the game flow, and integrates the graphical interface with the game logic. This class also oversees player turns and communicates updates to the interface.

- **`Pedina.java`**:  
  This class represents individual game pieces. It defines the attributes of each piece, including its position on the board and whether it has been promoted to a dama. The class also handles piece-specific actions, such as movement and promotion.

- **`Mossa.java`**:  
  This class implements the movement logic. It validates the legality of moves, including diagonal movements, capturing opponent pieces, and handling special dama movements.

- **`Vittoria.java`**:  
  The victory detection logic is encapsulated in this class. It evaluates the board state after each move to determine if a player has won or if the game has reached a stalemate.

### 2. Graphical Interface Components
The graphical user interface (GUI) is designed to make the game visually appealing and user-friendly. Key components include:

- **Game Board**:  
  The board is implemented as a grid of 64 buttons, each representing a square. The background colors alternate to create the checkered pattern, and only the dark squares are interactive for gameplay. Pieces are represented by icons placed on the buttons.

- **Player Indicators**:  
  Labels are used to display the current player's turn and the number of pieces each player has remaining. These indicators are updated dynamically as the game progresses.

### 3. Images and Assets
Custom icons represent the pieces on the board. These icons are simple circular designs, with distinct colors for white and black pieces. Dama pieces may feature additional visual enhancements to distinguish them from regular pieces.

---

## Future Enhancements

While the current implementation provides a complete gameplay experience, there are plans to expand and enhance the game in future versions:

1. **Difficulty Levels**:  
   Adding multiple difficulty levels for AI opponents will challenge players of varying skill levels.

2. **Game Recording and Analysis**:  
   A feature to record games and replay them for analysis will be introduced. This can help players improve their strategies by reviewing past moves.

3. **Statistics and Leaderboards**:  
   Integrating game statistics, such as win rates, average move times, and leaderboards, will add a competitive edge to the experience.

4. **Customizations**:  
   Options to customize the board and pieces' appearance will allow players to personalize their gaming experience.

---

## Conclusion

*Dama Italiana* is a timeless board game that combines strategy and entertainment. This digital version preserves the essence of the classic game while introducing modern features to enhance accessibility and gameplay. Whether you're a seasoned player or new to Italian Checkers, this project offers an engaging and enjoyable way to experience this beloved game.

---

## Authors

This project was developed by **Group 3**:  
- **Melek Chteoui**  
- **Simone La Salvia**

Their collaboration has brought the traditional game of Italian Checkers into the digital age, offering players a well-crafted and enjoyable experience.

---

This README should now provide a detailed overview and meet your word count requirements! Let me know if you'd like further refinements.
