# 📱🎲 Farkle Game - Android App

> A fully functional two-player **Farkle** dice game built in Android Studio using Java and XML. This app handles game logic, UI interaction, and scoring based on official Farkle rules.  Originally developed for CMSCI 256 - Principles of Software Development, this game has since been updated with improved functionality.

## 🕹️ Features

- 🎮 Two-player gameplay with name input
- 🎲 Real-time dice rolling with image buttons
- ✅ Selectable, lockable dice with visual state changes
- 🧠 Turn scoring and Farkle detection
- ♻️ Hot Dice Bonus: Using all six dice in a single round will automatically re-roll all dice and points earned so far will carry over - giving them a chance to score even more
- 🏆 Game ends when a player reaches 10,000 points

Add all points from the current turn to their turn total. Immediately get a fresh set of six dice to continue rolling.

Continue their turn—no need

## 📊 Scoring Table

| Combination                        | Points     |
|------------------------------------|------------|
| Single 1                           | 100 pts    |
| Single 5                           | 50 pts     |
| Three 1s                           | 300 pts    |
| Three 2s                           | 200 pts    |
| Three 3s                           | 300 pts    |
| Three 4s                           | 400 pts    |
| Three 5s                           | 500 pts    |
| Three 6s                           | 600 pts    |
| Four of a Kind                     | 1000 pts   |
| Five of a Kind                     | 2000 pts   |
| Six of a Kind                      | 3000 pts   |
| Straight (1-6)                     | 1500 pts   |
| Three Pairs                        | 1500 pts   |
| Two Triplets                       | 2500 pts   |
|Four of a Kind + a Pair             | 1500 pts   |

![farkle_scoring](https://github.com/user-attachments/assets/a6f0fb9c-f33b-48e4-98fd-b12403142a46)

## 🛠️ Tools Used

- Java
- Android Studio
- Android XML
- Android

## 💡 Skills Demonstrated

- Built a multi-activity Android app using Java and managing UI with XML layouts.
- Visual dice selection/locking using color feedback
- Real-time updates to scores and player turns

## 📂 Project Structure


## 🧪 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/kndang/Cybersecurity-Portfolio.git
    
2. Navigate to the project folder
   ```bash
   cd Cybersecurity-Portfolio/Android-Farkle
   
3.Open in Android Studio.
4.Build and run the app on an emulator or Android device.

## 🔧 Planned Improvements

- 🎲 Animated Dice Rolls.
- 🔊 Sound Effects — Play sounds on roll, score, and farkle.

## 📷 Screenshots

![image](https://github.com/user-attachments/assets/79adcd40-6f14-46a2-afb2-4e752e58ddaf)

**Start Screen**

![image](https://github.com/user-attachments/assets/8e3e5a20-5f0f-4bda-a84d-c6786c698515)

**Help Screen (Overview, How to Play, and Scoring Guide graphic)**

![image](https://github.com/user-attachments/assets/edba7643-f3f3-4e61-b3c7-73df6628cf8b)

**Players Name Input**

![image](https://github.com/user-attachments/assets/77820c2f-ea3a-4cff-8ce9-09034a49d7b8)

**At the start of every turn the dices are red**

![image](https://github.com/user-attachments/assets/7be2dc73-f154-4a7d-a0ec-6c709f55fe67)

**When player roll the background of the dices will turn grey making them selectable**

![image](https://github.com/user-attachments/assets/7eefc9fd-af39-4241-9ac8-d5c0c3501e45)

**Invalid Die Selection - invoke when player select a non-scoring die**

![image](https://github.com/user-attachments/assets/00a167fa-ba7f-4582-b9c7-8b5da739323a)

**Hot Dice will activate when player select the score button. Dices will auto re-roll.**

![image](https://github.com/user-attachments/assets/e1dadbd6-537b-4bae-afde-aa2cf9c4a77f)

**Hot Dice: Points earned from prev round will carry over to current round**

![image](https://github.com/user-attachments/assets/f4e806cd-6f17-4acd-8a8c-280d6c79ea5b)

**Shows all 3 possible option of the dice bg: grey = selectable, green = current selection, red=locked**

![image](https://github.com/user-attachments/assets/4cbb6921-656e-4e21-84bc-b5dd54b3a8dc)

**Farkle: All points earned from the round will be removed**

![image](https://github.com/user-attachments/assets/69036bd7-810b-477c-9b36-4d978b07ee5d)

**Winning Screen: A player earned 10,000 pts**

## 🎲 Assets

All dice images used in this project were created by me. They are free to use within this project. If you'd like to use them elsewhere, please contact me for permission.
