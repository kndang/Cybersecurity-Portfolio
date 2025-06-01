package com.kelly.farkle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[] buttons = new ImageButton[6];
    int[] buttonState = new int[6];

    final int PLAYABLE_DIE = 0;
    final int SELECTED_DIE = 1;
    final int LOCK_DIE = 2;

    int[] dieImages = new int[6];
    int[] dieValue = new int[6];

    int turnScore;
    int totalScore;
    Button roll, score, pass;
    TextView turn, total;
    boolean isPlayerOneTurn = true;
    int totalScoreP1 = 0;
    int totalScoreP2 = 0;
    String firstPlayer;
    String secondPlayer;
    TextView currentPlayerIndicator;

    TextView scoreP1;
    TextView scoreP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        // get players name
        Intent intent = getIntent();
        firstPlayer = intent.getStringExtra(PlayersActivity.NAME_P1);
        secondPlayer = intent.getStringExtra(PlayersActivity.NAME_P2);

        TextView playerone = findViewById(R.id.playerOne);
        TextView playertwo = findViewById(R.id.playerTwo);
        playerone.setText(firstPlayer);
        playertwo.setText(secondPlayer);

        turn = findViewById(R.id.turn);

        scoreP1 = findViewById(R.id.scoreP1);
        scoreP2 = findViewById(R.id.scoreP2);
        currentPlayerIndicator = findViewById(R.id.currentPlayerIndicator);

        updateCurrentPlayerUI();

        buttons[0] = findViewById(R.id.imageButton);
        buttons[1] = findViewById(R.id.imageButton2);
        buttons[2] = findViewById(R.id.imageButton3);
        buttons[3] = findViewById(R.id.imageButton4);
        buttons[4] = findViewById(R.id.imageButton5);
        buttons[5] = findViewById(R.id.imageButton6);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(this);
            buttons[i].setEnabled(false);
            buttons[i].setSelected(false);
        }

        roll = findViewById(R.id.roll);
        roll.setOnClickListener(this);

        score = findViewById(R.id.score);
        score.setOnClickListener(this);
        score.setEnabled(false);

        pass = findViewById(R.id.pass);
        pass.setOnClickListener(this);
        pass.setEnabled(false);

        dieImages[0] = R.drawable.one;
        dieImages[1] = R.drawable.two;
        dieImages[2] = R.drawable.three;
        dieImages[3] = R.drawable.four;
        dieImages[4] = R.drawable.five;
        dieImages[5] = R.drawable.six;

        resetDice();
    }

    @Override
    public void onClick(View v) {
        if (v.equals(roll)) {
            for (int i = 0; i < buttons.length; i++) {
                if (buttonState[i] == PLAYABLE_DIE) {
                    int dieFace = (int) (Math.random() * 6);
                    dieValue[i] = dieFace;
                    buttons[i].setImageResource(dieImages[dieFace]);
                    buttons[i].setEnabled(true);
                }
            }

            roll.setEnabled(false);
            score.setEnabled(true);
            pass.setEnabled(false);

            if (!hasScoringDice()) {
                turnScore = 0;
                turn.setText("Current Score: " + turnScore);

                new AlertDialog.Builder(this)
                        .setTitle("Farkle!")
                        .setMessage("No scoring dice! You lose your turn.")
                        .setCancelable(false)
                        .setPositiveButton("OK", (dialog, id) -> dialog.dismiss())
                        .show();

                resetDice();
                isPlayerOneTurn = !isPlayerOneTurn;
                updateCurrentPlayerUI();
                return;
            }

        } else if (v.equals(score)) {
            int[] valueCount = new int[7];

            for (int i = 0; i < buttonState.length; i++) {
                if (buttonState[i] == SELECTED_DIE) {
                    valueCount[dieValue[i] + 1]++;
                }
            }

            if ((valueCount[2] > 0 && valueCount[2] < 3) ||
                    (valueCount[3] > 0 && valueCount[3] < 3) ||
                    (valueCount[4] > 0 && valueCount[4] < 3) ||
                    (valueCount[6] > 0 && valueCount[6] < 3)) {

                new AlertDialog.Builder(this)
                        .setTitle("Invalid Die Selection")
                        .setMessage("Possible scoring combinations: single 1, single 5, or three of a kind.")
                        .setCancelable(false)
                        .setPositiveButton("OK", (dialog, id) -> dialog.dismiss())
                        .show();
                return;
            }

            int scoreToAdd = 0;
            boolean valid = false;

            // Check for straight (1-6)
            boolean isStraight = true;
            for (int i = 1; i <= 6; i++) {
                if (valueCount[i] != 1) {
                    isStraight = false;
                    break;
                }
            }
            if (isStraight) {
                scoreToAdd += 1500;
                valid = true;
            }

            // check for three pairs
            int pairCount = 0;
            for (int i = 1; i <= 6; i++) {
                if (valueCount[i] == 2) pairCount++;
            }
            if (pairCount == 3) {
                scoreToAdd += 1500;
                valid = true;
            }

            // check for two triplets
            int tripletCount = 0;
            for (int i = 1; i <= 6; i++) {
                if (valueCount[i] == 3) tripletCount++;
            }
            if (tripletCount == 2) {
                scoreToAdd += 2500;
                valid = true;
            }

            // Check for four of a kind + a pair
            boolean foundFour = false;
            boolean foundPair = false;

            for (int i = 1; i <= 6; i++) {
                if (valueCount[i] == 4) foundFour = true;
                if (valueCount[i] == 2) foundPair = true;
            }
            if (foundFour && foundPair) {
                scoreToAdd += 1500;
                valid = true;
            }


            // check for three, four, five, or 6 of a kind
            for (int i = 1; i <= 6; i++) {
                int count = valueCount[i];
                if (count >= 3) {
                    switch (count) {
                        case 3:
                            scoreToAdd += (i == 1) ? 300 : i * 100;
                            break;
                        case 4:
                            scoreToAdd += 1000;
                            break;
                        case 5:
                            scoreToAdd += 2000;
                            break;
                        case 6:
                            scoreToAdd += 3000;
                            break;
                    }
                    valid = true;
                }
            }

            // single 1s or 5s
            if (valueCount[1] < 3) {
                scoreToAdd += valueCount[1] * 100;
                if (valueCount[1] > 0) valid = true;
            }
            if (valueCount[5] < 3) {
                scoreToAdd += valueCount[5] * 50;
                if (valueCount[5] > 0) valid = true;
            }

            if (!valid) {
                new AlertDialog.Builder(this)
                        .setTitle("Invalid Selection")
                        .setMessage("You must select valid scoring dice.")
                        .setCancelable(false)
                        .setPositiveButton("OK", (dialog, id) -> dialog.dismiss())
                        .show();
                return;
            }

            turnScore += scoreToAdd;
            turn.setText("Current Score: " + turnScore);

            for (int i = 0; i < buttons.length; i++) {
                if (buttonState[i] == SELECTED_DIE) {
                    buttonState[i] = LOCK_DIE;
                    buttons[i].setSelected(false);
                    buttons[i].setEnabled(false); // locked
                }
            }

            boolean allLocked = true;
            for (int i = 0; i < buttons.length; i++) {
                if (buttonState[i] != LOCK_DIE) {
                    allLocked = false;
                    break;
                }
            }

            if (allLocked) {
                // Hot Dice: player used all dice to score
                // Reset dice and immediately reroll
                for (int i = 0; i < buttons.length; i++) {
                    buttonState[i] = PLAYABLE_DIE;
                    buttons[i].setEnabled(true);
                    buttons[i].setSelected(false);
                }

                // Reroll all dice immediately
                for (int i = 0; i < buttons.length; i++) {
                    int dieFace = (int) (Math.random() * 6);
                    dieValue[i] = dieFace;
                    buttons[i].setImageResource(dieImages[dieFace]);
                }

                roll.setEnabled(false);
                score.setEnabled(true);
                pass.setEnabled(false);

                return;
            }


            roll.setEnabled(true);
            score.setEnabled(false);
            pass.setEnabled(true);
        }

        else if (v.equals(pass)) {
            if (isPlayerOneTurn) {
                totalScoreP1 += turnScore;
            } else {
                totalScoreP2 += turnScore;
            }

            turnScore = 0;
            turn.setText("Current Score: " + turnScore);

            isPlayerOneTurn = !isPlayerOneTurn;
            updateCurrentPlayerUI();


            if (totalScoreP1 >= 10000 || totalScoreP2 >= 10000) {
                String winner = (totalScoreP1 >= 10000) ? firstPlayer : secondPlayer;
                new AlertDialog.Builder(this)
                        .setTitle("Game Over")
                        .setMessage(winner + " wins!")
                        .setCancelable(false)
                        .setPositiveButton("OK", (dialog, id) -> finish())
                        .show();
                return;
            }

            resetDice();
        }

        else {
            for (int i = 0; i < buttons.length; i++) {
                if (v.equals(buttons[i])) {
                    if (buttonState[i] == PLAYABLE_DIE) {
                        buttonState[i] = SELECTED_DIE;
                        buttons[i].setSelected(true);   // This triggers the green background
                    } else if (buttonState[i] == SELECTED_DIE) {
                        buttonState[i] = PLAYABLE_DIE;
                        buttons[i].setSelected(false);  // This resets to gray
                    }
                }
            }
        }
    }

    private void resetDice() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false); //re-enables when rerolling
            buttonState[i] = PLAYABLE_DIE;
            buttons[i].setSelected(false); //reset green highlight
        }
        roll.setEnabled(true);
        score.setEnabled(false);
        pass.setEnabled(false);
    }

    private void updateCurrentPlayerUI() {
        currentPlayerIndicator.setText("Current: " + (isPlayerOneTurn ? firstPlayer : secondPlayer));
        scoreP1.setText("Score: " + totalScoreP1);
        scoreP2.setText("Score: " + totalScoreP2);
    }

    private boolean hasScoringDice() {
        int[] counts = new int[7];
        for (int i = 0; i < dieValue.length; i++) {
            if (buttonState[i] == PLAYABLE_DIE) {
                counts[dieValue[i] + 1]++;
            }
        }

        boolean isStraight = true;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] != 1) {
                isStraight = false;
                break;
            }
        }
        if (isStraight) return true;

        int pairCount = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) pairCount++;
        }
        if (pairCount == 3) return true;

        int tripletCount = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) tripletCount++;
        }
        if (tripletCount == 2) return true;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) return true;
        }

        return counts[1] > 0 || counts[5] > 0;
    }
}
