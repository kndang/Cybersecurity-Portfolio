package com.kelly.farkle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayersActivity extends AppCompatActivity {
    public static final String NAME_P1 = "edu.msmary.farkle.NAME_P1";
    public static final String NAME_P2 = "edu.msmary.farkle.NAME_P2";

    private EditText player1;
    private EditText player2;
    private Button submitButton;

    //submit button is only clickable when both players enters their name
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            checkFieldsForEmptyValues();
        }
        @Override
        public void afterTextChanged(Editable editable) {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        player1 = findViewById(R.id.p1Name);
        player2 = findViewById(R.id.p2Name);
        submitButton = findViewById(R.id.submitButton);

        player1.addTextChangedListener(textWatcher);
        player2.addTextChangedListener(textWatcher);

        //GameActivity is open when submit button is clicked
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameActivity();
            }
        });

        checkFieldsForEmptyValues();

    }

    private  void checkFieldsForEmptyValues(){
        String p1Input = player1.getText().toString();
        String p2Input = player2.getText().toString();

        if (p1Input.length() > 0 && p2Input.length() > 0) {
            submitButton.setEnabled(true);
        } else {
            submitButton.setEnabled(false);
        }

    }

    public void openGameActivity() {
        //send players name to GameActivity
        String P1 = player1.getText().toString();
        String P2 = player2.getText().toString();
        Intent intent = new Intent(this, GameActivity.class);intent.putExtra(NAME_P1, P1);
        intent.putExtra(NAME_P2,P2);
        startActivity(intent);

    }
}