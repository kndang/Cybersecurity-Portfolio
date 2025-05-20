# Java Hangman Game with GUI

## 🎮 Introduction

An interactive Hangman game built using Java Swing. It allows user to play the game with 3 types of difficulty, custom word list support, and a simple menu-based interface.

## 🧩 Features

- Gui built with Java Swing
- Difficulty selection: easy, medium, and hard (# of lives)
- Interactive keyboard
- Live hangman drawing updates with each incorrect guess
- Game status display:
  - Remaining lives.
  - Secret word progress (with dashes and revealed letters)
- Win or Lose Screens:
  - "You Win" = player correctly guessed the word
  - "You Lose" = Player lost all lives
- Replayability: Option to start a new game or quit at the end of each round
- Import secret word list via text file:
  - Users can load a **.txt** file with their own set of secret words.

## 📂 File Structure
- **StartJFrame.java**: launch screen with difficulty selection
- **HangmanJFrame.java**: Main gameplay interface with UI components and logic
- **GameController.java**: main logic controller that deals with the word selection, game state, and user input
- **WinJFrame.java**: Displays the winning screen with option to start or exit the game

## 🧠 Skills Learned
- Gained experience using the Java Swing framework
- Learned how to use file I/O in Java
- Gained experience on how to handle user actions (button clicks and menu selection)

## 🛠️Tools Used
- Java 8
- Swing GUI Framework
- Java File I/O

## 🚀 How to Run
1. Clone or download the repository. 
2. Open the project in Eclipse or any Java IDE. (must have 1.8 or higher)
3. Run StartJFrame.java to start the game.
   - Optional: To use your own word list, go to Menu > Open File within the game window and select a **.txt** file containing one word per line.

## 📸 Screenshots

![image](https://github.com/user-attachments/assets/2f0d90f9-55f8-4805-987b-8520301010c2)

*Start Screen*

![image](https://github.com/user-attachments/assets/8408e5b3-0c19-44f5-86a7-f1b049e9b468)

*Main Game Interface*

![image](https://github.com/user-attachments/assets/2c103389-2ada-4aa2-b009-784b02a4d5f0)

*How an ongoing Game look like*

![image](https://github.com/user-attachments/assets/98b6e3d2-cc83-4813-a477-b6f5bc3b3f69)

*File option to import custom word list*

![image](https://github.com/user-attachments/assets/3cd03d9d-f2be-4d6d-bd74-64baf17262bc)

*Win Game Screen*
